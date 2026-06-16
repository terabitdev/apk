package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import ho.q;
import i3.t;
import io.elevenlabs.ui.extensions.AutofillExtensionsKt;
import java.util.List;
import r1.v0;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f17217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f17218c;

    public /* synthetic */ l(List list, int i10, ho.l lVar) {
        this.f17216a = i10;
        this.f17217b = list;
        this.f17218c = lVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z TraitSection$lambda$0;
        switch (this.f17216a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                TraitSection$lambda$0 = VoiceDesignTipsSheetKt.TraitSection$lambda$0(this.f17217b, this.f17218c, (v0) obj, (m) obj2, intValue);
                return TraitSection$lambda$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                return AutofillExtensionsKt.a(this.f17217b, this.f17218c, (t) obj, (m) obj2, intValue2);
        }
    }
}
