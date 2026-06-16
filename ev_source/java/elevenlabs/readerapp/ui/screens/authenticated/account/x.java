package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import i4.q2;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountState;
import r1.z1;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ho.q {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15045a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sn.d f15050f;

    public /* synthetic */ x(ho.a aVar, boolean z6, q2 q2Var, ho.a aVar2, ho.a aVar3, ho.a aVar4) {
        this.f15046b = aVar;
        this.f15047c = z6;
        this.Y = q2Var;
        this.f15048d = aVar2;
        this.f15049e = aVar3;
        this.f15050f = aVar4;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z ManagePurchasesScreenUI$lambda$0;
        z DeleteAccountScreenUi$lambda$4;
        switch (this.f15045a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ManagePurchasesScreenUI$lambda$0 = ManagePurchasesScreenKt.ManagePurchasesScreenUI$lambda$0(this.f15046b, this.f15047c, (q2) this.Y, (ho.a) this.f15048d, (ho.a) this.f15049e, (ho.a) this.f15050f, (z1) obj, (u2.m) obj2, intValue);
                return ManagePurchasesScreenUI$lambda$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                DeleteAccountScreenUi$lambda$4 = DeleteAccountScreenKt.DeleteAccountScreenUi$lambda$4((DeleteAccountState) this.f15048d, this.f15046b, (String) this.f15049e, (ho.l) this.f15050f, this.f15047c, (z0) this.Y, (z1) obj, (u2.m) obj2, intValue2);
                return DeleteAccountScreenUi$lambda$4;
        }
    }

    public /* synthetic */ x(DeleteAccountState deleteAccountState, ho.a aVar, String str, ho.l lVar, boolean z6, z0 z0Var) {
        this.f15048d = deleteAccountState;
        this.f15046b = aVar;
        this.f15049e = str;
        this.f15050f = lVar;
        this.f15047c = z6;
        this.Y = z0Var;
    }
}
