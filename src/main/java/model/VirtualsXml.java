package model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.thoughtworks.xstream.annotations.XStreamAlias;

// Алиас приказывает XStream (де)сериализовывать <virtualConfig> вместо <com.website.packagename.VirtualsConfig>
@XStreamAlias("virtualConfig")
public class VirtualsXml {
	// Приказываем хибернейт валидатору провести валидацию непримитивного типа WorkstationHypervisorConfig
	// такой аннотацией можно помечать непримитивные типы, их коллекции или массивы
	@Valid
	private WorkstationHypervisorConfig workstationHypervisor;
	
	@Valid
	private List<VmRunWorkstation> workstations;
	
	public VirtualsXml(WorkstationHypervisorConfig workstationHypervisor,
			List<VmRunWorkstation> workstations) {
		super();
		this.workstationHypervisor = workstationHypervisor;
		this.workstations = workstations;
	}

	public WorkstationHypervisorConfig getWorkstationHypervisor() {
		return workstationHypervisor;
	}

	public List<VmRunWorkstation> getWorkstations() {
		return workstations;
	}
	
	@Override
	public String toString() {
		return "VirtualsConfig [workstationHypervisor=" + workstationHypervisor
				+ ", workstations=" + workstations + "]";
	}
}