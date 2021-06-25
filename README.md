# Android system services 
(Implementation of a android systemservice in AOSP in Hikey960 board)

**The system services play a key role in exposing the low-level functions of the hardware and the Linux kernel to the high-level applications.**

**What makes System service different from Android Services?**
System Services are started by `SystemServer` so they run as a System process which gives them additional privileges which normal Android Service will never get.

To create a system service, we need the following components:

-   AIDL service interface
-   Application to host the service
-   Client library for untrusted applications (from the play store) to use the service
-   Simple client application for testing our service

**Images provided below will help you understand the basic working of System Service.**

1.
![enter image description here](https://raw.githubusercontent.com/koushikDeb/AOSPSystemService/main/CallService.png)
2.Communication between application to system server via Binder IPC
![enter image description here](https://raw.githubusercontent.com/koushikDeb/AOSPSystemService/main/Service_Commu.png)
Image & knowledge Source [Digging Into Android System Services - [Dave Smith]](https://www.youtube.com/watch?v=M6extgmQQNw&t=1716s/).

