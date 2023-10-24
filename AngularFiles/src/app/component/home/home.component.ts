import {Component, OnInit} from '@angular/core';
import { BikeService } from "../../services/bike.service";
import { FormGroup, FormControl, Validators} from '@angular/forms';
import {Observable, throwError} from "rxjs";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  models: string[] = [
    'Global MTP 29 Full Suspension',
    'Global Carbon Fiber Race Series',
    'Global Time Trail Blade'
  ];
  bikeform: FormGroup;
  validMessage: string = "";
  constructor(private bikeService: BikeService) {
    this.bikeform = new FormGroup({
      name: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
      phone: new FormControl('', Validators.required),
      model: new FormControl('', Validators.required),
      serialNumber: new FormControl('', Validators.required),
      purchasePrice: new FormControl('', Validators.required),
      purchaseDate: new FormControl('', Validators.required),
      contact: new FormControl(),
    });
  }

  ngOnInit(): void {
  }

  submitRegistration() {
    if(this.bikeform.valid) {
      this.validMessage = "Your bike registration has been submitted. Thank you!";
      this.bikeService.createBikeRegistration(this.bikeform.value).subscribe(
        data => {
          this.bikeform.reset();
          return true;
        },
        error => {
          return throwError(error);
        }
      )
    } else {
      this.validMessage = "Please fill out the form before submitting!";
    }
  }
















}
