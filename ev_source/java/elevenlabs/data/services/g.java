package io.elevenlabs.data.services;

import io.elevenlabs.data.model.response.PronunciationResponse;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PronunciationsServiceImpl f14124b;

    public /* synthetic */ g(PronunciationsServiceImpl pronunciationsServiceImpl, int i10) {
        this.f14123a = i10;
        this.f14124b = pronunciationsServiceImpl;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14123a) {
            case 0:
                return PronunciationsServiceImpl$createPronunciation$2.d(this.f14124b, (PronunciationResponse) obj);
            default:
                return PronunciationsServiceImpl$updatePronunciation$2.d(this.f14124b, (PronunciationResponse) obj);
        }
    }
}
