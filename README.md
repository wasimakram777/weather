**Weather Service for Berlin**
This repository provides a Spring Boot application that fetches weather data for Berlin from the OpenWeather API, processes the data, and exposes a RESTful API endpoint for clients to fetch the processed data. Additionally, this project includes Docker configurations and HelmCharts for deploying on a Kubernetes cluster.

**Prerequisites**
- Java 17 
- Gradle
- Docker
- Kubernetes
- Helm
- OpenWeather API Key: Create an account at OpenWeather and get your API Key.

**Setup**
**Spring Boot Application**
**  Clone the repository:**
  '''
    git clone [repository-url]
    cd [repository-name]
  '''
  
**Build the project:**
  '''
    ./gradew build
  '''
  
**Docker**
  '''
    docker build -t my-weather-app .
    docker login
    docker tag prvnv7/springboot:<tagname> prvnv7/springboot:<tagname>
    docker push prvnv7/springboot:<tagname>
  '''
  
**Kubernetes & Helm**
  Kubernetes is installed using kubeadm method, installation script is added under script folder
  
**Install the Helm chart:**
'''
  helm install weatherservice-release ./weatherservice/
'''

**Check the service:**
'''
  kubectl get svc weatherservice-release
'''

**Access the application**
'''
curl http://[EXTERNAL-IP]/<NodePort>/weather/getCurrentWeather
'''
