# Use the official Ubuntu image as the base image
FROM ubuntu:latest

# Update the package list and install Python 3
RUN apt-get update && apt-get install -y python3


# Specify the command to run the Python 3 REPL by default
CMD ["python3"]
