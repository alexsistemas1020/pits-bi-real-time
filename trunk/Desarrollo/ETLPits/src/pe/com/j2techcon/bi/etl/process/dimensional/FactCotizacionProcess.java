package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;



public class FactCotizacionProcess {
	
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
	
	private TCotizacion tCotizacion;
	private TCotizacionExample tCotizacionExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private FactCotizacion factCotizacion;
	private FactCotizacionExample factCotizacionExample;
	
	private DimTiempo dimTiempo;
	private DimTiempoExample dimTiempoExample;
	
	private TCotizacionManager tCotizacionManager;
	private TParametroManager tParametroManager;
	private DimTiempoManager dimTiempoManager;
	private FactCotizacionManager factCotizacionManager;
	
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

	public TCotizacion gettCotizacion() {
		return tCotizacion;
	}

	public void settCotizacion(TCotizacion tCotizacion) {
		this.tCotizacion = tCotizacion;
	}

	public TCotizacionExample gettCotizacionExample() {
		return tCotizacionExample;
	}

	public void settCotizacionExample(TCotizacionExample tCotizacionExample) {
		this.tCotizacionExample = tCotizacionExample;
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

	public FactCotizacion getFactCotizacion() {
		return factCotizacion;
	}

	public void setFactCotizacion(FactCotizacion factCotizacion) {
		this.factCotizacion = factCotizacion;
	}

	public FactCotizacionExample getFactCotizacionExample() {
		return factCotizacionExample;
	}

	public void setFactCotizacionExample(FactCotizacionExample factCotizacionExample) {
		this.factCotizacionExample = factCotizacionExample;
	}

	public DimTiempo getDimTiempo() {
		return dimTiempo;
	}

	public void setDimTiempo(DimTiempo dimTiempo) {
		this.dimTiempo = dimTiempo;
	}

	public DimTiempoExample getDimTiempoExample() {
		return dimTiempoExample;
	}

	public void setDimTiempoExample(DimTiempoExample dimTiempoExample) {
		this.dimTiempoExample = dimTiempoExample;
	}

	public TCotizacionManager gettCotizacionManager() {
		return tCotizacionManager;
	}

	public void settCotizacionManager(TCotizacionManager tCotizacionManager) {
		this.tCotizacionManager = tCotizacionManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimTiempoManager getDimTiempoManager() {
		return dimTiempoManager;
	}

	public void setDimTiempoManager(DimTiempoManager dimTiempoManager) {
		this.dimTiempoManager = dimTiempoManager;
	}

	public FactCotizacionManager getFactCotizacionManager() {
		return factCotizacionManager;
	}

	public void setFactCotizacionManager(FactCotizacionManager factCotizacionManager) {
		this.factCotizacionManager = factCotizacionManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public FactCotizacionProcess(BeanFactory factory, int sizePage,
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

		tCotizacionManager = factory.getBean("tCotizacionManager", TCotizacionManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factCotizacionManager = factory.getBean("factCotizacionManager", FactCotizacionManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tCotizacionExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCotizacion> lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
			if(lstCotizacion.size()>0){
				for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
					tCotizacion = iterator.next();
					factCotizacion.clear();
					processRecordCotizacion();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				tCotizacionExample.clear();
				tCotizacionExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tCotizacionExample.createCriteria().andProcIdNotEqualTo(process);
				lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
				if(lstCotizacion.size()>0){
					for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
						tCotizacion = iterator.next();
						factCotizacion.clear();
						processRecordCotizacion();
					}
				}
				
				lstCotizacion.clear();
				tCotizacionExample.clear();
				offset = 0;
				break;
			}
		}
		
		if(recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}
		else{
			resultProcess = constantes.getResultProcessCompletedErrors();
		}

		return resultProcess;
	}
	
	public void processRecordCotizacion(){
		
		completeFildCotizacion();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tCotizacion.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalCotizacion()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericCotizacion(stateRecordGeneric);
	}
	
	public void completeFildCotizacion(){
		factCotizacion.setCotizacionKey(tCotizacion.getCotiId());
		factCotizacion.setCotizacionKeyClienteArea(tCotizacion.getAreCliId());
		factCotizacion.setCotizacionKeyServicio(tCotizacion.getCotiCodServ());
		factCotizacion.setCotizacionKeyProducto(tCotizacion.getProdId());
		
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCotizacion.getCotiFecApro());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factCotizacion.setCotizacionKeyFecApro(dimTiempo.getTiempoKey());
		
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCotizacion.getCotiFecIni());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factCotizacion.setCotizacionKeyFecIni(dimTiempo.getTiempoKey());
		
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCotizacion.getCotiFecFin());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factCotizacion.setCotizacionKeyFecFin(dimTiempo.getTiempoKey());

		factCotizacion.setCotizacionKeyEstado(tCotizacion.getCotiCodEst());
		
		factCotizacion.setProcId(process);
	}
	
	public int insertRecordDimensionalCotizacion(){
		try{
			resultTransaction = factCotizacionManager.insertSelective(factCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalCotizacion(){
		try{
			resultTransaction = factCotizacionManager.updateByPrimaryKeySelective(factCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalCotizacion(){
		try{
			resultTransaction = factCotizacionManager.deleteByPrimaryKey(factCotizacion.getCotizacionKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericCotizacion(String statusRecord){
		try{
			int idCotizacion = tCotizacion.getCotiId();
			tCotizacion.clear();
			tCotizacion.setCotiId(idCotizacion);
			tCotizacion.setCodIndCam(statusRecord);
			tCotizacion.setProcId(process);
			tCotizacionManager.updateByPrimaryKeySelective(tCotizacion);
		}catch(Exception e){
			
		}
	}
}