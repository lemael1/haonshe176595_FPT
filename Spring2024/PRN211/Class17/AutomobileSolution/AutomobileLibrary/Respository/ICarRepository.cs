using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AutomobileLibrary.BussinessObject;

namespace AutomobileLibrary.Respository
{
    public interface ICarRepository
    {
        IEnumerable<Car> GetCars();
        Car GetCarByID(int id);
        void InsertCar(Car car);
        void DeleteCar(int carId);
        void UpdateCar(Car car);

    }
}
