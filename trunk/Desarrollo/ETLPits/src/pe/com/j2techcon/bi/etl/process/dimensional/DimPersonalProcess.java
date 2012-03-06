package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimPersonalManager;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoCategoriaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonal;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimPersonalExample;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleado;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public class DimPersonalProcess {
	
	private BeanFactory factory;
	private int sizePage;
	private long dateTimeFrom;
	private long dateTimeUntil;
	private String typeProcess;
	private int process;
	
	private int recordTotal;
	private int recordProcessed;
	private int recordRejected;
	private int resultProcess;
	private int resultTransaction;
	
	private String stateRecordDimensional;
	private String stateRecordGeneric;
	
	private TEmpleado tEmpleado;
	private TEmpleadoExample tEmpleadoExample;
	
	private TEmpleadoCategoria tEmpleadoCategoria;
	private TEmpleadoCategoriaExample tEmpleadoCategoriaExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimPersonal dimPersonal;
	private DimPersonalExample dimPersonalExample;
	
	private TEmpleadoManager tEmpleadoManager;
	private TEmpleadoCategoriaManager tEmpleadoCategoriaManager;
	private TParametroManager tParametroManager; 
	private DimPersonalManager dimPersonalManager;
	
	private Constantes constantes;

	public BeanFactory getFactory() {
		return factory;
	}

	public void setFactory(BeanFactory factory) {
		this.factory = factory;
	}

	public int getSizePage() {
		return sizePage;
	}

	public void setSizePage(int sizePage) {
		this.sizePage = sizePage;
	}

	public long getDateTimeFrom() {
		return dateTimeFrom;
	}

	public void setDateTimeFrom(long dateTimeFrom) {
		this.dateTimeFrom = dateTimeFrom;
	}

	public long getDateTimeUntil() {
		return dateTimeUntil;
	}

	public void setDateTimeUntil(long dateTimeUntil) {
		this.dateTimeUntil = dateTimeUntil;
	}

	public String getTypeProcess() {
		return typeProcess;
	}

	public void setTypeProcess(String typeProcess) {
		this.typeProcess = typeProcess;
	}

	public int getProcess() {
		return process;
	}

	public void setProcess(int process) {
		this.process = process;
	}

	public int getRecordTotal() {
		return recordTotal;
	}

	public void setRecordTotal(int recordTotal) {
		this.recordTotal = recordTotal;
	}

	public int getRecordProcessed() {
		return recordProcessed;
	}

	public void setRecordProcessed(int recordProcessed) {
		this.recordProcessed = recordProcessed;
	}

	public int getRecordRejected() {
		return recordRejected;
	}

	public void setRecordRejected(int recordRejected) {
		this.recordRejected = recordRejected;
	}

	public int getResultProcess() {
		return resultProcess;
	}

	public void setResultProcess(int resultProcess) {
		this.resultProcess = resultProcess;
	}

	public int getResultTransaction() {
		return resultTransaction;
	}

	public void setResultTransaction(int resultTransaction) {
		this.resultTransaction = resultTransaction;
	}

	public String getStateRecordDimensional() {
		return stateRecordDimensional;
	}

	public void setStateRecordDimensional(String stateRecordDimensional) {
		this.stateRecordDimensional = stateRecordDimensional;
	}

	public String getStateRecordGeneric() {
		return stateRecordGeneric;
	}

	public void setStateRecordGeneric(String stateRecordGeneric) {
		this.stateRecordGeneric = stateRecordGeneric;
	}

	public TEmpleado gettEmpleado() {
		return tEmpleado;
	}

	public void settEmpleado(TEmpleado tEmpleado) {
		this.tEmpleado = tEmpleado;
	}

	public TEmpleadoExample gettEmpleadoExample() {
		return tEmpleadoExample;
	}

	public void settEmpleadoExample(TEmpleadoExample tEmpleadoExample) {
		this.tEmpleadoExample = tEmpleadoExample;
	}

	public TEmpleadoCategoria gettEmpleadoCategoria() {
		return tEmpleadoCategoria;
	}

	public void settEmpleadoCategoria(TEmpleadoCategoria tEmpleadoCategoria) {
		this.tEmpleadoCategoria = tEmpleadoCategoria;
	}

	public TEmpleadoCategoriaExample gettEmpleadoCategoriaExample() {
		return tEmpleadoCategoriaExample;
	}

	public void settEmpleadoCategoriaExample(TEmpleadoCategoriaExample tEmpleadoCategoriaExample) {
		this.tEmpleadoCategoriaExample = tEmpleadoCategoriaExample;
	}

	public TParametro gettParametro() {
		return tParametro;
	}

	public void settParametro(TParametro tParametro) {
		this.tParametro = tParametro;
	}

	public TParametroExample gettParametroExample() {
		return tParametroExample;
	}

	public void settParametroExample(TParametroExample tParametroExample) {
		this.tParametroExample = tParametroExample;
	}

	public DimPersonal getDimPersonal() {
		return dimPersonal;
	}

	public void setDimPersonal(DimPersonal dimPersonal) {
		this.dimPersonal = dimPersonal;
	}

	public DimPersonalExample getDimPersonalExample() {
		return dimPersonalExample;
	}

	public void setDimPersonalExample(DimPersonalExample dimPersonalExample) {
		this.dimPersonalExample = dimPersonalExample;
	}

	public TEmpleadoManager gettEmpleadoManager() {
		return tEmpleadoManager;
	}

	public void settEmpleadoManager(TEmpleadoManager tEmpleadoManager) {
		this.tEmpleadoManager = tEmpleadoManager;
	}

	public TEmpleadoCategoriaManager gettEmpleadoCategoriaManager() {
		return tEmpleadoCategoriaManager;
	}

	public void settEmpleadoCategoriaManager(TEmpleadoCategoriaManager tEmpleadoCategoriaManager) {
		this.tEmpleadoCategoriaManager = tEmpleadoCategoriaManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimPersonalManager getDimPersonalManager() {
		return dimPersonalManager;
	}

	public void setDimPersonalManager(DimPersonalManager dimPersonalManager) {
		this.dimPersonalManager = dimPersonalManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimPersonalProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess, int process) {
		this.factory = factory;
		this.sizePage = sizePage;
		this.dateTimeFrom = dateTimeFrom;
		this.dateTimeUntil = dateTimeUntil;
		this.typeProcess = typeProcess;
		this.process = process;
		
		recordTotal = constantes.getValueNumberDefault();
		recordProcessed = constantes.getValueNumberDefault();
		recordRejected = constantes.getValueNumberDefault();
		resultProcess = constantes.getResultProcessStarted();
		resultTransaction = constantes.getResultTransactionNoResult();
		stateRecordDimensional = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();
		
	}

	public int startProcess(){

		tEmpleadoManager = factory.getBean("tEmpleadoManager", TEmpleadoManager.class);
		tEmpleadoCategoriaManager = factory.getBean("tEmpleadoCategoriaManager", TEmpleadoCategoriaManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimPersonalManager = factory.getBean("dimPersonalManager", DimPersonalManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tEmpleadoCategoriaExample.clear();
			tEmpleadoCategoriaExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tEmpleadoCategoriaExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TEmpleadoCategoria> lstEmpleadoCategoria = tEmpleadoCategoriaManager.selectByExample(tEmpleadoCategoriaExample);
			if(lstEmpleadoCategoria.size()>0){
				for (Iterator<TEmpleadoCategoria> iterator = lstEmpleadoCategoria.iterator(); iterator.hasNext();) {
					tEmpleadoCategoria = iterator.next();
					dimPersonal.clear();
					processRecordEmpleadoCategoria();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				tEmpleadoCategoriaExample.clear();
				tEmpleadoCategoriaExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tEmpleadoCategoriaExample.createCriteria().andProcIdNotEqualTo(process);
				lstEmpleadoCategoria = tEmpleadoCategoriaManager.selectByExample(tEmpleadoCategoriaExample);
				if(lstEmpleadoCategoria.size()>0){
					for (Iterator<TEmpleadoCategoria> iterator = lstEmpleadoCategoria.iterator(); iterator.hasNext();) {
						tEmpleadoCategoria = iterator.next();
						dimPersonal.clear();
						processRecordEmpleadoCategoria();
					}
				}
				
				lstEmpleadoCategoria.clear();
				tEmpleadoCategoriaExample.clear();
				offset = 0;
				break;
			}
		}
		
		while(true) {
			
			tEmpleadoExample.clear();
			tEmpleadoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tEmpleadoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TEmpleado> lstEmpleado = tEmpleadoManager.selectByExample(tEmpleadoExample);
			if(lstEmpleado.size()>0){
				for (Iterator<TEmpleado> iterator = lstEmpleado.iterator(); iterator.hasNext();) {
					tEmpleado = iterator.next();
					dimPersonal.clear();
					dimPersonalExample.clear();
					processRecordPersonal();
				}
				offset = offset + constantes.getSizePage();
			}
			
			if(lstEmpleado.size()<constantes.getSizePage()){
				
				tEmpleadoExample.clear();
				tEmpleadoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tEmpleadoExample.createCriteria().andProcIdNotEqualTo(process);
				lstEmpleado = tEmpleadoManager.selectByExample(tEmpleadoExample);
				if(lstEmpleado.size()>0){
					for (Iterator<TEmpleado> iterator = lstEmpleado.iterator(); iterator.hasNext();) {
						tEmpleado = iterator.next();
						dimPersonal.clear();
						dimPersonalExample.clear();
						processRecordPersonal();
					}
				}
				
				lstEmpleado.clear();
				tEmpleadoExample.clear();
				offset = 0;
				break;
			}
		}
		
		if(recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedErrors();
		}
		else{
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}

		return resultProcess;
	}
	
	public void processRecordEmpleadoCategoria(){
		
		completeFildEmpleadoCategoria();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tEmpleadoCategoria.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalEmpleadoCategoria()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalEmpleadoCategoria() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalEmpleadoCategoria() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalEmpleadoCategoria() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericEmpleadoCategoria(stateRecordGeneric);
		if(
			tEmpleado.getFecNumCam()>=dateTimeFrom
			&& tEmpleado.getFecNumCam()<=dateTimeUntil
			&& tEmpleado.getProcId() != process
		){
			updateRecordGenericPersonal(stateRecordGeneric);
		}
	}
	
	public void processRecordPersonal(){
		completeFildPersonal();
		
		if(updateRecordDimensionalPersonal() > constantes.getResultTransactionNoResult()){
			stateRecordGeneric = constantes.getStateRecordProcessed();
			recordProcessed = recordProcessed + 1; 
		} 

		if(tEmpleado.getProcId() != process){
			updateRecordGenericPersonal(stateRecordGeneric);
		}
	}
	
	public void completeFildEmpleadoCategoria(){
		dimPersonal.setPersonalKey(tEmpleadoCategoria.getEmpCatId());
		
		dimPersonal.setPersonalCodigoCategoria(tEmpleadoCategoria.getEmpCatCodTip());
		if(tEmpleadoCategoria.getEmpCatCodTip() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tEmpleadoCategoria.getEmpCatCodTip());
			dimPersonal.setPersonalDescripcionCategoria(tParametro.getParamDes());
		}else{
			dimPersonal.setPersonalDescripcionCategoria(constantes.getValueStringDefault());
		}
		
		tEmpleado = tEmpleadoManager.selectByPrimaryKey(tEmpleadoCategoria.getEmpId());
		
		if(tEmpleado.getFecNumCam() >= dateTimeFrom && tEmpleado.getFecNumCam() <= dateTimeUntil){
			dimPersonal.setPersonalCodigo(tEmpleado.getEmpCod());
			dimPersonal.setPersonalNombre(tEmpleado.getEmpDesApePat() + " " + tEmpleado.getEmpDesApeMat() + " " + tEmpleado.getEmpDesNom());
			dimPersonal.setPersonalSexo(tEmpleado.getEmpSex());
		}
		
		dimPersonal.setProcId(process);
	}
	
	public void completeFildPersonal(){
		dimPersonalExample.createCriteria().andPersonalKeyEqualTo(tEmpleado.getEmpId());
		dimPersonalExample.createCriteria().andProcIdNotEqualTo(process);
		
		dimPersonal.setPersonalCodigo(tEmpleado.getEmpCod());
		dimPersonal.setPersonalNombre(tEmpleado.getEmpDesApePat() + " " + tEmpleado.getEmpDesApeMat() + " " + tEmpleado.getEmpDesNom());
		dimPersonal.setPersonalSexo(tEmpleado.getEmpSex());
		dimPersonal.setProcId(process);
	}
	
	public int insertRecordDimensionalEmpleadoCategoria(){
		try{
			resultTransaction = dimPersonalManager.insertSelective(dimPersonal);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalEmpleadoCategoria(){
		try{
			resultTransaction = dimPersonalManager.updateByPrimaryKeySelective(dimPersonal);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalPersonal(){
		try{
			resultTransaction = dimPersonalManager.updateByExampleSelective(dimPersonal, dimPersonalExample);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalEmpleadoCategoria(){
		try{
			resultTransaction = dimPersonalManager.deleteByPrimaryKey(dimPersonal.getPersonalKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public int deleteRecordDimensionalPersonal(){
		try{
			resultTransaction = dimPersonalManager.deleteByExample(dimPersonalExample);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericEmpleadoCategoria(String statusRecord){
		try{
			int idEmpleadoCategoria = tEmpleadoCategoria.getEmpCatId();
			tEmpleadoCategoria.clear();
			tEmpleadoCategoria.setEmpCatId(idEmpleadoCategoria);
			tEmpleadoCategoria.setCodIndCam(statusRecord);
			tEmpleadoCategoria.setProcId(process);
			tEmpleadoCategoriaManager.updateByPrimaryKeySelective(tEmpleadoCategoria);
		}catch(Exception e){
			
		}
	}
	
	public void updateRecordGenericPersonal(String statusRecord){
		try{
			int idPersonal = tEmpleado.getEmpId();
			tEmpleado.clear();
			tEmpleado.setEmpId(idPersonal);
			tEmpleado.setCodIndCam(statusRecord);
			tEmpleado.setProcId(process);
			tEmpleadoManager.updateByPrimaryKeySelective(tEmpleado);
		}catch(Exception e){
			
		}
	}
}