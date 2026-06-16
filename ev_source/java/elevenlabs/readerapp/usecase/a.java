package io.elevenlabs.readerapp.usecase;

import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean numberOfCores$lambda$0;
        numberOfCores$lambda$0 = DevicePerformanceMeasurerImpl.getNumberOfCores$lambda$0(file);
        return numberOfCores$lambda$0;
    }
}
