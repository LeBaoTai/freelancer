# Freelancer Project

# Link youtube

https://youtu.be/dAYgfosyyNo


# Jenkins execute shell

```bash
find /var/lib/jenkins/workspace/<ten_job> -mindepth 1 -maxdepth 1 -exec scp -r {} root@<ip_may_docker>:~/project/ \;
ansible-playbook /var/lib/jenkins/playbook/deployment.yaml
```

# Deployment

```yml
- name: build and deploy Java app with Docker
  hosts: <khai_bao_trong_file_hosts>
  gather_facts: false
  remote_user: root
  tasks:

    - name: Stopping the Container
      docker_container:
        name: spring-container
        image: dockerlbt/springboot:latest
        state: stopped

    - name: Removing the Container
      docker_container:
        name: spring-container
        image: dockerlbt/springboot:latest
        state: absent

    - name: Removing Docker Image
      docker_image:
        name: dockerlbt/springboot:latest
        state: absent

    - name: Building Docker Image
      docker_image:
        name: dockerlbt/springboot:latest
        source: build
        build:
          path: ~/project/
        state: present

    - name: Creating the Container
      docker_container:
        name: spring-container
        image: dockerlbt/springboot:latest
        ports:
          - "80:8080"
        state: started
```
