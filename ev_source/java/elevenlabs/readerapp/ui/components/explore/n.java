package io.elevenlabs.readerapp.ui.components.explore;

import i3.t;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.SignInAccountBannedMessageTextKt;
import io.elevenlabs.ui.components.AnimatedDigitCounterKt;
import io.elevenlabs.ui.components.RemoteIconKt;
import m2.g2;
import s4.y0;
import sn.z;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14627f;

    public /* synthetic */ n(long j4, y0 y0Var, ho.p pVar, int i10, int i11) {
        this.f14622a = 4;
        this.f14624c = j4;
        this.f14627f = y0Var;
        this.f14623b = pVar;
        this.f14625d = i10;
        this.f14626e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreReadPriceRow_FNF3uiM$lambda$0;
        z SignInAccountBannedMessageText_FNF3uiM$lambda$1;
        z AnimatedDigitCounter_FNF3uiM$lambda$5;
        switch (this.f14622a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreReadPriceRow_FNF3uiM$lambda$0 = ExploreReadCardKt.ExploreReadPriceRow_FNF3uiM$lambda$0((ExploreRead) this.f14627f, (t) this.f14623b, this.f14624c, this.f14625d, this.f14626e, (u2.m) obj, intValue);
                return ExploreReadPriceRow_FNF3uiM$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                SignInAccountBannedMessageText_FNF3uiM$lambda$1 = SignInAccountBannedMessageTextKt.SignInAccountBannedMessageText_FNF3uiM$lambda$1((t) this.f14623b, (y0) this.f14627f, this.f14624c, this.f14625d, this.f14626e, (u2.m) obj, intValue2);
                return SignInAccountBannedMessageText_FNF3uiM$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                AnimatedDigitCounter_FNF3uiM$lambda$5 = AnimatedDigitCounterKt.AnimatedDigitCounter_FNF3uiM$lambda$5((String) this.f14627f, (y0) this.f14623b, this.f14624c, this.f14625d, this.f14626e, (u2.m) obj, intValue3);
                return AnimatedDigitCounter_FNF3uiM$lambda$5;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                return RemoteIconKt.a((String) this.f14627f, (t) this.f14623b, this.f14624c, this.f14625d, this.f14626e, (u2.m) obj, intValue4);
            default:
                ((Integer) obj2).getClass();
                g2.b(this.f14624c, (y0) this.f14627f, (ho.p) this.f14623b, (u2.m) obj, r.M(this.f14625d | 1), this.f14626e);
                return z.f31622a;
        }
    }

    public /* synthetic */ n(t tVar, y0 y0Var, long j4, int i10, int i11) {
        this.f14622a = 1;
        this.f14623b = tVar;
        this.f14627f = y0Var;
        this.f14624c = j4;
        this.f14625d = i10;
        this.f14626e = i11;
    }

    public /* synthetic */ n(Object obj, Object obj2, long j4, int i10, int i11, int i12) {
        this.f14622a = i12;
        this.f14627f = obj;
        this.f14623b = obj2;
        this.f14624c = j4;
        this.f14625d = i10;
        this.f14626e = i11;
    }
}
