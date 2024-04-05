# Deploy consul with k8s


```yaml
# config.yaml

# Configure global settings in this section.
global:
  name: consul
  # Bootstrap ACLs within Consul. This is highly recommended.
  acls:
    manageSystemACLs: true
  # Gossip encryption
  gossipEncryption:
    autoGenerate: true
# Configure your Consul servers in this section.
server:
  # Specify three servers that wait until all are healthy to bootstrap the Consul cluster.
  replicas: 3
  # Specify the resources that servers request for placement. These values will serve a large environment.
  resources:
    requests:
      memory: '1Gi'
      cpu: '1'
      disk: '5Gi'
    limits:
      memory: '2Gi'
      cpu: '2'
      disk: '5Gi'
  # If using Enterprise, reference the Kubernetes secret that holds your license here
  enterpriseLicense:
    secretName: 'consul-license'
    secretKey: 'key'
# Configure Consul clients in this section
client:
  # Specify the resources that clients request for deployment.
  resources:
    requests:
      memory: '1Gi'
      cpu: '1'
      disk: '2Gi'
    limits:
      memory: '2Gi'
      cpu: '2'
      disk: '5Gi'
# Enable and configure the Consul UI.
ui:
  enabled: true
# Enable Consul connect pod injection
connectInject:
  enabled: true
  default: true
controller:
  enabled: true

```


```bash
  helm repo add hashicorp https://helm.releases.hashicorp.com
```

```bash
helm install consul hashicorp/consul --values config.yaml --create-namespace --namespace spring-microservice --version "0.43.0"
```