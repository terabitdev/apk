package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.InterestsQuestion;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15013c;

    public /* synthetic */ i(Object obj, Object obj2, int i10) {
        this.f15011a = i10;
        this.f15012b = obj;
        this.f15013c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z Content$lambda$1$0;
        ManageContentInterestsState submitInterests$lambda$0;
        switch (this.f15011a) {
            case 0:
                return AccountViewModel$loadPage$1.h((AccountViewModel) this.f15012b, (AsyncCallResult.Error) this.f15013c, (AccountState) obj);
            case 1:
                return ManageContentInterestsViewModel$loadInterests$1$1.d((AsyncCallResult.Success) this.f15012b, (ManageContentInterestsViewModel) this.f15013c, (ManageContentInterestsState) obj);
            case 2:
                Content$lambda$1$0 = ManageContentInterestsScreenKt.Content$lambda$1$0((InterestsQuestion) this.f15012b, (ho.p) this.f15013c, (u1.w) obj);
                return Content$lambda$1$0;
            default:
                submitInterests$lambda$0 = ManageContentInterestsViewModel.submitInterests$lambda$0((ManageContentInterestsViewModel) this.f15012b, (InterestsQuestion) this.f15013c, (ManageContentInterestsState) obj);
                return submitInterests$lambda$0;
        }
    }
}
