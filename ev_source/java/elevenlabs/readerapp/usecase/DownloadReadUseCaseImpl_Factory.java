package io.elevenlabs.readerapp.usecase;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.NavigationService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DownloadReadUseCaseImpl_Factory implements c {
    private final f loggerProvider;
    private final f navigationServiceProvider;
    private final f offlineReadsServiceProvider;
    private final f readsServiceProvider;
    private final f stringProvider;
    private final f toastServiceProvider;
    private final f voicesServiceProvider;

    private DownloadReadUseCaseImpl_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7) {
        this.offlineReadsServiceProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.voicesServiceProvider = fVar3;
        this.navigationServiceProvider = fVar4;
        this.toastServiceProvider = fVar5;
        this.stringProvider = fVar6;
        this.loggerProvider = fVar7;
    }

    public static DownloadReadUseCaseImpl_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7) {
        return new DownloadReadUseCaseImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static DownloadReadUseCaseImpl newInstance(OfflineReadsService offlineReadsService, ReadsService readsService, VoicesService voicesService, NavigationService navigationService, ToastService toastService, StringProvider stringProvider, Logger logger) {
        return new DownloadReadUseCaseImpl(offlineReadsService, readsService, voicesService, navigationService, toastService, stringProvider, logger);
    }

    @Override // rn.a
    public DownloadReadUseCaseImpl get() {
        return newInstance((OfflineReadsService) this.offlineReadsServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (VoicesService) this.voicesServiceProvider.get(), (NavigationService) this.navigationServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get(), (Logger) this.loggerProvider.get());
    }
}
