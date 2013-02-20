#!/bin/sh

wget --no-check-certificate https://192.168.1.26:443/ws/deployment?xsd=1
wget --no-check-certificate https://192.168.1.26:443/ws/deployment?xsd=2
wget --no-check-certificate deployment3.xsd
wget --no-check-certificate https://192.168.1.26:443/ws/deployment?xsd=4
wget --no-check-certificate https://192.168.1.26:443/ws/lognotif?xsd=1
wget --no-check-certificate https://192.168.1.26:443/ws/lognotif?xsd=2
wget --no-check-certificate https://192.168.1.26:443/ws/orcmon?xsd=1
wget --no-check-certificate https://192.168.1.26:443/ws/orcmon?xsd=2
wget --no-check-certificate https://192.168.1.26:443/ws/orcmon?xsd=3
wget --no-check-certificate https://192.168.1.26:443/ws/orcmon?xsd=4
wget --no-check-certificate https://192.168.1.26:443/ws/orcmon?xsd=5
wget --no-check-certificate https://192.168.1.26:443/ws/orcmon?xsd=6
wget --no-check-certificate https://192.168.1.26:443/ws/security?xsd=1
wget --no-check-certificate https://192.168.1.26:443/ws/security?xsd=2
wget --no-check-certificate https://192.168.1.26:443/ws/staging?xsd=1
wget --no-check-certificate https://192.168.1.26:443/ws/system?xsd=1
wget --no-check-certificate https://192.168.1.26:443/ws/system?xsd=2
wget --no-check-certificate https://192.168.1.26:443/ws/system?xsd=3
