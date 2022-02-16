
import './App.css';
import {EmployeeItems,EmployeeDelete, EmployeeStore, EmployeeUpdate} from './components/EmployeeCRUD';
import {Link, Routes, Route} from 'react-router-dom';
function Navigation(){
return(<div className='btn-group' role="group" aria-label='basic-outlined example'>
  <Link className='btn btn-info' to = "/store">Store</Link> 
<Link className='btn btn-info' to = "/fetchAll">fetchAll</Link> 
<Link className='btn btn-info' to = "/update">Update Employee</Link> 
<Link className='btn btn-danger' to = "/delete">Delete Employee</Link> 
</div>);

}
function App() {
  return (
    <div className="container-sm">
      <h1 className="test-center">Welcome to React With Node</h1>
     <div className='row'>
       <div className='col-5'>
         <Navigation/>
       </div>
     </div>
     <div className='row'>
       <div className='col'>
        <Routes>
          <Route path='/' element={<EmployeeItems/>}/>
          <Route path='/store' element={<EmployeeStore/>}/>
          <Route path='/fetchAll' element={<EmployeeItems/>}/>
          <Route path='/update' element={<EmployeeUpdate/>}/>
          <Route path='/delete' element={<EmployeeDelete/>}/>
        </Routes>
       </div>
       </div>
    </div>
  );
}
export default App;