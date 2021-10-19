# adapter
Here we have a Company interface that contains 4 methods to be implemented. We have a CompanyDB class that inherits Company. These are essentially Getters for id, name, description and foundedDate. Let’s say we get another data source to pull from in our application CompanyOtherDB (Not a recommended class name) . This contains similar data but different names and types. We can’t directly inherit Company from this class because there are different names and types. The Adapter pattern will take care of this for us. Let’s look at each class step by step.
<p align="center">
  <img src="https://github.com/aruskembaeva/sdp-ass3/blob/main/ass3.png">
</p>
