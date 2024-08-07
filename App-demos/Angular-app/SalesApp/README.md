# SalesApp - Demo Flow

Note: 
- if the suggestions are not aligned, start typing the code based on the requirement to get better suggestions
- [open Copilot](https://docs.github.com/en/copilot/getting-started-with-github-copilot/getting-started-with-github-copilot-in-visual-studio-code#seeing-multiple-suggestions-in-a-new-tab) to see the suggestions


## Demo Script

- Navigate to the bar-chart or line-chart component under src > app
- Open the code behind file to show the chart creation logic based on Chart.js
- Navigate to the market-chart component under src > app
- Open the code behind file maket-chart.component.ts 
- Within the component class use the below prompt to get the code suggestions
  ```
  define a method to create the donut chart based on market share data for last 5 years
  ```
  OR use the following prompt to get the code suggestions
  ```
    define a method to create the pie chart based on market share data for last 5 years
    ```
  OR use the following prompt to get the code suggestions
  ```
    define a method to create the polar area chart based on market share data for last 5 years
    ```
- You may need to change the canvas id used within the createChart() method or the method generated above with "chart3". This is the canvas id from market-chart.component.html
 
- Provide the following prompt within the ngOnInit() method toinvoke the chart creation method
  ```
     invoke the create Chart method
   ```
