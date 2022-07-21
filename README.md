## Automation tests for HumbleBundle

#### Link to webpage - [www.humblebundle.com](https://www.humblebundle.com/)

### Libraries used 
* TestNG
* Selenium
* WebDriverManager

## Test Cases

### 1. View all results
* Enter text into search field
* Click "View All Results"
* Check if new window contains elements with entered text

### 2. View if next search page contains entered text
* Enter text into search field
* Click arrow in dropdown window to go to next page
* Check if next page contains elements with entered text

### 3. Add to cart test
* Enter text into search field
* Click first result
* Ckick "Add To Cart" button
* Check if total changes from "0" to "1"

### 4. Filter and check results
* Hover over Filter field
* Click "New Releases" option
* Check if results are available

### 5. Check if publisher is the same when selecting a different game
* Click publishers name
* Select a different game published by the company
* Check if publisher matches