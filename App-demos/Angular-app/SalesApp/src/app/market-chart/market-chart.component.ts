import { Component } from '@angular/core';
// import the charting library
import Chart from 'chart.js/auto';

@Component({
  selector: 'app-market-chart',
  templateUrl: './market-chart.component.html',
  styleUrls: ['./market-chart.component.scss']
})
export class MarketChartComponent {

  public chart: any;

  ngOnInit(): void {
     }
}
