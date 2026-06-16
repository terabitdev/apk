package io.elevenlabs.domain.usecase;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/usecase/DevicePerformanceResult;", "", "performanceClass", "Lio/elevenlabs/domain/usecase/DevicePerformanceClass;", "additionalProperties", "", "", "<init>", "(Lio/elevenlabs/domain/usecase/DevicePerformanceClass;Ljava/util/Map;)V", "getPerformanceClass", "()Lio/elevenlabs/domain/usecase/DevicePerformanceClass;", "getAdditionalProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class DevicePerformanceResult {
    private final Map<String, Object> additionalProperties;
    private final DevicePerformanceClass performanceClass;

    public DevicePerformanceResult(DevicePerformanceClass devicePerformanceClass, Map<String, ? extends Object> map) {
        devicePerformanceClass.getClass();
        map.getClass();
        this.performanceClass = devicePerformanceClass;
        this.additionalProperties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicePerformanceResult copy$default(DevicePerformanceResult devicePerformanceResult, DevicePerformanceClass devicePerformanceClass, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            devicePerformanceClass = devicePerformanceResult.performanceClass;
        }
        if ((i10 & 2) != 0) {
            map = devicePerformanceResult.additionalProperties;
        }
        return devicePerformanceResult.copy(devicePerformanceClass, map);
    }

    /* renamed from: component1, reason: from getter */
    public final DevicePerformanceClass getPerformanceClass() {
        return this.performanceClass;
    }

    public final Map<String, Object> component2() {
        return this.additionalProperties;
    }

    public final DevicePerformanceResult copy(DevicePerformanceClass performanceClass, Map<String, ? extends Object> additionalProperties) {
        performanceClass.getClass();
        additionalProperties.getClass();
        return new DevicePerformanceResult(performanceClass, additionalProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicePerformanceResult)) {
            return false;
        }
        DevicePerformanceResult devicePerformanceResult = (DevicePerformanceResult) other;
        if (this.performanceClass == devicePerformanceResult.performanceClass && m.c(this.additionalProperties, devicePerformanceResult.additionalProperties)) {
            return true;
        }
        return false;
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final DevicePerformanceClass getPerformanceClass() {
        return this.performanceClass;
    }

    public int hashCode() {
        return this.additionalProperties.hashCode() + (this.performanceClass.hashCode() * 31);
    }

    public String toString() {
        return "DevicePerformanceResult(performanceClass=" + this.performanceClass + ", additionalProperties=" + this.additionalProperties + Separators.RPAREN;
    }
}
