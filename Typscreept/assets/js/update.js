class Update{
updatePriceSection(event) {
    var children = document.getElementById("pricingSection").children;
    console.log("Updating");
    for (var i = 0; i < children.length; i++) {
      if (children[i].id == event.target.value) {
        children[i].style.display = "block";
      } else {
        children[i].style.display = "none";
      }
    }
  }
}