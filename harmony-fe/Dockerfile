FROM node:lts-alpine3.14 as Builder

WORKDIR /app

COPY . .

RUN npm install 
RUN npm run build

FROM nginx:latest

WORKDIR /usr/share/nginx/html

RUN rm -rf *

COPY frontend-nginx.conf  /etc/nginx/conf.d/nginx.conf

COPY --from=Builder /app/dist/harmony-fe .

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
