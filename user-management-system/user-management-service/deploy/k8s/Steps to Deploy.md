# 1. Build Docker image:
```bash
docker build -t user-management-service:0.0.1-SNAPSHOT .
```
# 2. Push Docker image to a registry (e.g., Docker Hub):
```bash
docker tag user-management-service:0.0.1-SNAPSHOT your-dockerhub-username/user-management-service:0.0.1-SNAPSHOT
docker push your-dockerhub-username/user-management-service:0.0.1-SNAPSHOT
```
# 3. Apply Kubernetes manifests:
```bash
kubectl apply -f k8s-deployment.yaml
kubectl apply -f k8s-service.yaml
``` 
# 4. Verify the deployment:
```bash
kubectl get pods
kubectl get services
```
# 5. Access the service:
- If using a LoadBalancer service, get the external IP:
```bash
kubectl get services user-management-service
```
- If using NodePort, access via `<NodeIP>:<NodePort>`.  
- If using Ingress, access via the configured domain name.
# 6. Monitor logs:
```bash
kubectl logs -f <pod-name>
```
# 7. Scale the deployment (if needed):
```bash
kubectl scale deployment user-management-service --replicas=3
```
# 8. Update the deployment (if needed):
- Build and push a new Docker image with a new tag.
- Update the image in the deployment:
```bash
kubectl set image deployment/user-management-service user-management-service=your-dockerhub-username/user-management-service:<new-tag>
```
# 9. Clean up resources (if needed):
```bash
kubectl delete -f k8s-deployment.yaml
kubectl delete -f k8s-service.yaml
```
