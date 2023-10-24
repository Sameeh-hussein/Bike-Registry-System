import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOption = {
  Headers: new HttpHeaders( { 'Content-Type' : 'application/json' } )
}
@Injectable({
  providedIn: 'root'
})
export class BikeService {

  constructor(private http:HttpClient) { }
  getBikes(): Observable<any> {
    return this.http.get('/server/api/v1/bikes');
  }
}
