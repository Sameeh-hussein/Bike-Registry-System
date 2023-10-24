import { Component } from '@angular/core';
import { BikeService } from 'src/app/services/bike.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {

  public bikes : any;
  constructor(private bikeService: BikeService) { }

  ngOnInit(){
    this.getBikes();
  }

  getBikes(){
    // @ts-ignore
    this.bikeService.getBikes().subscribe(
      data => (this.bikes = data),
      err => console.error(err),
      () => console.log('bikes loaded')
    )
  }
}
