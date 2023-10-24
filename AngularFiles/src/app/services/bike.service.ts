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

  getBike(id: number){
    return this.http.get('/server/api/v1/bikes/' + id);
  }

  createBikeRegistration({bike}: { bike: any }){
    let body = JSON.stringify(bike);
    // @ts-ignore
    return this.http.post('server/api/v1/bikes', body, httpOption);
  }
}
