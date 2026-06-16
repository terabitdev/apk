package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14984a;

    public /* synthetic */ e(int i10) {
        this.f14984a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z DeleteAccountScreenUi$lambda$4$0$1$3$0$0;
        z DeleteAccountScreenUi$lambda$0$0;
        switch (this.f14984a) {
            case 0:
                return DeleteAccountViewModel$deleteAccount$1.d((DeleteAccountState) obj);
            case 1:
                return DeleteAccountViewModel$deleteAccount$1.h((DeleteAccountState) obj);
            case 2:
                DeleteAccountScreenUi$lambda$4$0$1$3$0$0 = DeleteAccountScreenKt.DeleteAccountScreenUi$lambda$4$0$1$3$0$0((DeleteAccountViewModel) obj);
                return DeleteAccountScreenUi$lambda$4$0$1$3$0$0;
            default:
                DeleteAccountScreenUi$lambda$0$0 = DeleteAccountScreenKt.DeleteAccountScreenUi$lambda$0$0((l) obj);
                return DeleteAccountScreenUi$lambda$0$0;
        }
    }
}
