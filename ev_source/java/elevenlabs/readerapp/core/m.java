package io.elevenlabs.readerapp.core;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToastViewModel f14379b;

    public /* synthetic */ m(ToastViewModel toastViewModel, int i10) {
        this.f14378a = i10;
        this.f14379b = toastViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ToastState onToastHidden$lambda$0;
        z ToastOverlay$lambda$0$0;
        switch (this.f14378a) {
            case 0:
                onToastHidden$lambda$0 = ToastViewModel.onToastHidden$lambda$0(this.f14379b, (ToastState) obj);
                return onToastHidden$lambda$0;
            default:
                ToastOverlay$lambda$0$0 = ToastViewModelKt.ToastOverlay$lambda$0$0(this.f14379b, (ho.l) obj);
                return ToastOverlay$lambda$0$0;
        }
    }
}
