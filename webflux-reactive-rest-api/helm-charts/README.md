### Install Helm chart

Test the Install process with dry run and debug flags first

`` helm install --dry-run --debug helm-charts/ ``

Install

`` helm --name {name} --namespace {namespace} install helm-charts/ ``

View running pods

`` kubectl get pods ``

View all releases

`` helm ls --all ``

Port-forward for testing

`` kubectl port-forward $POD_NAME 8090:8090 ``

`` curl localhost:8090/hello-world ``

Delete release

`` helm delete --purge {name} ``

Describe deployments and services

`` kubectl describe deployments ``

`` kubectl describe services ``

View pod details

`` kubectl describe pods``
