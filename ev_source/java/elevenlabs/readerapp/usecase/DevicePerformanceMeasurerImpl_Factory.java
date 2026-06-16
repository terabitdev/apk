package io.elevenlabs.readerapp.usecase;

import android.content.Context;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DevicePerformanceMeasurerImpl_Factory implements c {
    private final f contextProvider;

    private DevicePerformanceMeasurerImpl_Factory(f fVar) {
        this.contextProvider = fVar;
    }

    public static DevicePerformanceMeasurerImpl_Factory create(f fVar) {
        return new DevicePerformanceMeasurerImpl_Factory(fVar);
    }

    public static DevicePerformanceMeasurerImpl newInstance(Context context) {
        return new DevicePerformanceMeasurerImpl(context);
    }

    @Override // rn.a
    public DevicePerformanceMeasurerImpl get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
