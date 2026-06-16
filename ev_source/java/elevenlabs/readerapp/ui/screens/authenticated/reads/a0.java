package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.services.AddPodcastResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddPodcastResult.LimitReached f16747b;

    public /* synthetic */ a0(AddPodcastResult.LimitReached limitReached, int i10) {
        this.f16746a = i10;
        this.f16747b = limitReached;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16746a) {
            case 0:
                return ImportFileViewModel$listen$1$1.m(this.f16747b, (ImportFileState) obj);
            case 1:
                return ImportLinkViewModel$onParsingCompleted$1$1.d(this.f16747b, (ImportLinkState) obj);
            default:
                return WriteViewModel$listen$1$1.i(this.f16747b, (WriteState) obj);
        }
    }
}
