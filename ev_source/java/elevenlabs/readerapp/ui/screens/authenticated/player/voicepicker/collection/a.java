package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import ho.p;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16362a;

    public /* synthetic */ a(int i10) {
        this.f16362a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16362a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewVoiceCollectionScreenDataDefaultGroupPreviewVoiceCollectionScreenData1Kt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewVoiceCollectionScreenDataDefaultGroupPreviewVoiceCollectionScreenDataKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewVoiceCollectionScreenErrorDefaultGroupPreviewVoiceCollectionScreenError1Kt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewVoiceCollectionScreenErrorDefaultGroupPreviewVoiceCollectionScreenErrorKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewVoiceCollectionScreenLoadingDefaultGroupPreviewVoiceCollectionScreenLoading1Kt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewVoiceCollectionScreenLoadingDefaultGroupPreviewVoiceCollectionScreenLoadingKt.a(mVar, intValue);
        }
    }
}
