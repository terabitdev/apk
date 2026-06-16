package io.elevenlabs.readerapp;

import io.elevenlabs.readerapp.usecase.CurrentActivityProvider;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReaderApp_MembersInjector implements jl.b {
    private final ul.f currentActivityProvider;
    private final ul.f installIntegrityCheckProvider;

    private ReaderApp_MembersInjector(ul.f fVar, ul.f fVar2) {
        this.installIntegrityCheckProvider = fVar;
        this.currentActivityProvider = fVar2;
    }

    public static jl.b create(ul.f fVar, ul.f fVar2) {
        return new ReaderApp_MembersInjector(fVar, fVar2);
    }

    public static void injectCurrentActivityProvider(ReaderApp readerApp, CurrentActivityProvider currentActivityProvider) {
        readerApp.currentActivityProvider = currentActivityProvider;
    }

    public static void injectInstallIntegrityCheck(ReaderApp readerApp, InstallIntegrityCheck installIntegrityCheck) {
        readerApp.installIntegrityCheck = installIntegrityCheck;
    }

    public void injectMembers(ReaderApp readerApp) {
        injectInstallIntegrityCheck(readerApp, (InstallIntegrityCheck) this.installIntegrityCheckProvider.get());
        injectCurrentActivityProvider(readerApp, (CurrentActivityProvider) this.currentActivityProvider.get());
    }
}
