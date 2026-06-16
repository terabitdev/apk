package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import p3.i0;
import p3.x;
import q2.b5;
import sn.z;
import t2.u;
import t2.w;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f17194c;

    public /* synthetic */ e(s2 s2Var, s2 s2Var2, int i10) {
        this.f17192a = i10;
        this.f17193b = s2Var;
        this.f17194c = s2Var2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z GeneratingStep$lambda$1$0$6$0;
        switch (this.f17192a) {
            case 0:
                GeneratingStep$lambda$1$0$6$0 = GeneratingStepKt.GeneratingStep$lambda$1$0$6$0(this.f17193b, this.f17194c, (i0) obj);
                return GeneratingStep$lambda$1$0$6$0;
            default:
                r3.e eVar = (r3.e) obj;
                float d02 = eVar.d0(b5.f26895c);
                s2 s2Var = this.f17193b;
                float f10 = 2;
                float f11 = d02 / f10;
                r3.e.K(eVar, ((x) s2Var.getValue()).f26440a, eVar.d0(w.f32259c / f10) - f11, 0L, new r3.i(d02, u.P, 0, 0, 30), 108);
                s2 s2Var2 = this.f17194c;
                if (h5.f.a(((h5.f) s2Var2.getValue()).f12083a, 0) > 0) {
                    r3.e.K(eVar, ((x) s2Var.getValue()).f26440a, eVar.d0(((h5.f) s2Var2.getValue()).f12083a) - f11, 0L, r3.h.f29426a, 108);
                }
                return z.f31622a;
        }
    }
}
