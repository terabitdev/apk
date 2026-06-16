package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.ui.components.SquareIconButtonKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16181a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f16184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3.t f16185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16186f;

    public /* synthetic */ h0(int i10, String str, ho.a aVar, i3.t tVar, int i11, int i12) {
        this.f16182b = i10;
        this.f16183c = str;
        this.f16184d = aVar;
        this.f16185e = tVar;
        this.f16186f = i11;
        this.Y = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PronunciationExistsDialogItem$lambda$1;
        sn.z SquareIconButton$lambda$3;
        switch (this.f16181a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                int i10 = this.f16182b;
                PronunciationExistsDialogItem$lambda$1 = PlayerPronunciationsKt.PronunciationExistsDialogItem$lambda$1(this.f16183c, i10, this.f16184d, this.f16185e, this.f16186f, this.Y, (u2.m) obj, intValue);
                return PronunciationExistsDialogItem$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SquareIconButton$lambda$3 = SquareIconButtonKt.SquareIconButton$lambda$3(this.f16182b, this.f16183c, this.f16184d, this.f16185e, this.f16186f, this.Y, (u2.m) obj, intValue2);
                return SquareIconButton$lambda$3;
        }
    }

    public /* synthetic */ h0(String str, int i10, ho.a aVar, i3.t tVar, int i11, int i12) {
        this.f16183c = str;
        this.f16182b = i10;
        this.f16184d = aVar;
        this.f16185e = tVar;
        this.f16186f = i11;
        this.Y = i12;
    }
}
