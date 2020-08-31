# micronaut-kubernetes-discovery-issue

Issue using kubernetes discovery feature:

1. Modify build files to use jib on build.gradle or push images yourself
2. Modify deployment files on `frontend/k8s.yml` and `backend/k8s.yml` to reflect the images built on step 1

Run the commands:
```
kubectl create namespace micronaut
kubectl apply -f auth.yml
kubectl apply -f backend/k8s.yml
kubectl apply -f frontend/k8s.yml
```

Fetch the frontend lb ip via

```
kubect get services -n micronaut
```

Curl the `backend` controller on the `frontend` application

```
curl http://<endpoint>/backend/health
```

Application freezes
