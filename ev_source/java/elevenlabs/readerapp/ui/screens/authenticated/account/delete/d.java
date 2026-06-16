package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import ho.l;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14983b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14982a = i10;
        this.f14983b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        DeleteAccountState emit$lambda$0;
        z DeleteAccountScreen$lambda$0$0;
        z DeleteAccountScreenUi$lambda$4$0$1$1$0;
        switch (this.f14982a) {
            case 0:
                emit$lambda$0 = DeleteAccountViewModel.AnonymousClass1.C00311.emit$lambda$0((User) this.f14983b, (DeleteAccountState) obj);
                return emit$lambda$0;
            case 1:
                DeleteAccountScreen$lambda$0$0 = DeleteAccountScreenKt.DeleteAccountScreen$lambda$0$0((DeleteAccountViewModel) this.f14983b, (l) obj);
                return DeleteAccountScreen$lambda$0$0;
            default:
                DeleteAccountScreenUi$lambda$4$0$1$1$0 = DeleteAccountScreenKt.DeleteAccountScreenUi$lambda$4$0$1$1$0((z0) this.f14983b, (String) obj);
                return DeleteAccountScreenUi$lambda$4$0$1$1$0;
        }
    }
}
