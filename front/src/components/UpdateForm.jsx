import React, { Fragment } from "react";
import { useForm } from "react-hook-form";

const UpdateForm = (props)=>
{
    const {register, formState: {errors}, handleSubmit, setValue} = useForm();
    setValue("nameItemUpdate",props.currentList.nameItemUpdate);
    return <Fragment>
        <form className="row" onSubmit={handleSubmit(props.onUpdate)}>
            <input disabled={props.currentList.id != ""?false:true} 
            className="form-control form-control-secondary mt-3 mb-1" type="text" placeholder="Nombre de la tarea a actualizar"
            {...register("nameItemUpdate", {required: true})}/>
            <div><b>{errors.nameItemUpdate && "Primero seleccione una tarea "}</b></div>
            <button className="btn btn-warning border border-dark " type="submit">Actualizar</button>
        </form>
    </Fragment>
}

export default UpdateForm;