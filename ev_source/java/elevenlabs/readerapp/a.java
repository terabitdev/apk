package io.elevenlabs.readerapp;

import io.elevenlabs.domain.services.AppCompatibilityDialogService;
import io.elevenlabs.readerapp.AppCompatibilityViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14342b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f14341a = i10;
        this.f14342b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AppCompatibilityState emit$lambda$0;
        z onCreate$lambda$1$0$0$2$0$1$0;
        switch (this.f14341a) {
            case 0:
                emit$lambda$0 = AppCompatibilityViewModel.AnonymousClass1.AnonymousClass3.emit$lambda$0((AppCompatibilityDialogService.Reason) this.f14342b, (AppCompatibilityState) obj);
                return emit$lambda$0;
            default:
                onCreate$lambda$1$0$0$2$0$1$0 = MainActivity.onCreate$lambda$1$0$0$2$0$1$0((MainActivity) this.f14342b, (String) obj);
                return onCreate$lambda$1$0$0$2$0$1$0;
        }
    }
}
