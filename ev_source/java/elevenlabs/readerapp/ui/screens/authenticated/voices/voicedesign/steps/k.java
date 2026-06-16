package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import java.util.List;
import w1.e0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17215b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f17214a = i10;
        this.f17215b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        int d10;
        switch (this.f17214a) {
            case 0:
                d10 = SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1.d((e0) this.f17215b);
                break;
            default:
                d10 = ((List) this.f17215b).size();
                break;
        }
        return Integer.valueOf(d10);
    }
}
