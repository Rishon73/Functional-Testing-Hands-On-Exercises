//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Script
{
    using System;
    using System.Xml;
    using System.Xml.Schema;
    using System.Collections.Generic;
    using HP.ST.Fwk.RunTimeFWK;
    using HP.ST.Fwk.RunTimeFWK.CheckpointFWK;
    using HP.ST.Fwk.RunTimeFWK.Utilities;
    using HP.ST.Ext.CheckpointLogicOperators;
    using HP.ST.Ext.BindingImpl.Getters;
    using HP.ST.Ext.BindingImpl.Setters;
    using HP.ST.Fwk.RunTimeFWK.BindingFWK;
    using HP.ST.Fwk.RunTimeFWK.BindingFWK.Getters;
    using HP.ST.Fwk.RunTimeFWK.BindingFWK.Setters;
    using HP.ST.Fwk.RunTimeFWK.BindingFWK.PropInfo;
    
    
    public partial class WorkFlowScript
    {
        
        private void set_StServiceCallActivity4_checkpoints(STActivityBase activity)
        {
            // Checkpoint 1
            IVTDGetter actualValueGetter1 = new VTDXPathGetter(new VTDPropertyInfoBase("OutputEnvelope", "/*[local-name(.)='Envelope'][1]/*[local-name(.)='Body'][1]/*[local-name(.)='AccountCreateResponse'][1]/*[local-name(.)='StatusMessage'][1]/*[local-name(.)='success'][1]"), XmlTypeCode.Boolean, false);
            IVTDSetter actualValueSetter1 = new VTDCheckpointSetter(XmlTypeCode.Boolean);
            BindDirection actualBindDirection1 = new BindDirection(_flow.StServiceCallActivity4, actualValueGetter1, actualValueSetter1);
            CpValObj valueActualObject1 = new CpValObj(actualBindDirection1, XmlTypeCode.Boolean, false);
            CpValObj valueExpectedObject1 = new CpValObj("true", XmlTypeCode.Boolean);
            ValueCPRule cpRule1 = new ValueCPRule(valueActualObject1, valueExpectedObject1, PrimitiveTypeCP.EqualTo, "=", false);
            activity.AddCheckpointRule(cpRule1);

            // Checkpoint 2
            IVTDGetter actualValueGetter2 = new VTDXPathGetter(new VTDPropertyInfoBase("OutputEnvelope", "/*[local-name(.)='Envelope'][1]/*[local-name(.)='Body'][1]/*[local-name(.)='AccountCreateResponse'][1]/*[local-name(.)='StatusMessage'][1]/*[local-name(.)='userId'][1]"), XmlTypeCode.Long, false);
            IVTDSetter actualValueSetter2 = new VTDCheckpointSetter(XmlTypeCode.Long);
            BindDirection actualBindDirection2 = new BindDirection(_flow.StServiceCallActivity4, actualValueGetter2, actualValueSetter2);
            CpValObj valueActualObject2 = new CpValObj(actualBindDirection2, XmlTypeCode.Long, false);
            CpValObj valueExpectedObject2 = new CpValObj("0", XmlTypeCode.Long);
            ValueCPRule cpRule2 = new ValueCPRule(valueActualObject2, valueExpectedObject2, PrimitiveTypeCP.LargerThan, ">", false);
            activity.AddCheckpointRule(cpRule2);

        }
        
        private void set_StServiceCallActivity9_checkpoints(STActivityBase activity)
        {
            // Checkpoint 1
            IVTDGetter actualValueGetter1 = new VTDXPathGetter(new VTDPropertyInfoBase("OutputEnvelope", "/*[local-name(.)='Envelope'][1]/*[local-name(.)='Body'][1]/*[local-name(.)='AddSafePayMethodResponse'][1]/*[local-name(.)='StatusMessage'][1]/*[local-name(.)='success'][1]"), XmlTypeCode.Boolean, false);
            IVTDSetter actualValueSetter1 = new VTDCheckpointSetter(XmlTypeCode.Boolean);
            BindDirection actualBindDirection1 = new BindDirection(_flow.StServiceCallActivity9, actualValueGetter1, actualValueSetter1);
            CpValObj valueActualObject1 = new CpValObj(actualBindDirection1, XmlTypeCode.Boolean, false);
            CpValObj valueExpectedObject1 = new CpValObj("true", XmlTypeCode.Boolean);
            ValueCPRule cpRule1 = new ValueCPRule(valueActualObject1, valueExpectedObject1, PrimitiveTypeCP.EqualTo, "=", false);
            activity.AddCheckpointRule(cpRule1);

        }
        
        private void set_StServiceCallActivity10_checkpoints(STActivityBase activity)
        {
            // Checkpoint 1
            IVTDGetter actualValueGetter1 = new VTDXPathGetter(new VTDPropertyInfoBase("OutputEnvelope", "/*[local-name(.)='Envelope'][1]/*[local-name(.)='Body'][1]/*[local-name(.)='AccountDeleteResponse'][1]/*[local-name(.)='StatusMessage'][1]/*[local-name(.)='success'][1]"), XmlTypeCode.Boolean, false);
            IVTDSetter actualValueSetter1 = new VTDCheckpointSetter(XmlTypeCode.Boolean);
            BindDirection actualBindDirection1 = new BindDirection(_flow.StServiceCallActivity10, actualValueGetter1, actualValueSetter1);
            CpValObj valueActualObject1 = new CpValObj(actualBindDirection1, XmlTypeCode.Boolean, false);
            CpValObj valueExpectedObject1 = new CpValObj("true", XmlTypeCode.Boolean);
            ValueCPRule cpRule1 = new ValueCPRule(valueActualObject1, valueExpectedObject1, PrimitiveTypeCP.EqualTo, "=", false);
            activity.AddCheckpointRule(cpRule1);

        }
    }
}