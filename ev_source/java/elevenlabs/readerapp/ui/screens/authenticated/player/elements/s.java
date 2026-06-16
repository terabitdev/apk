package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$3;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f16134b;

    public /* synthetic */ s(int i10, ReadMeta readMeta) {
        this.f16133a = i10;
        this.f16134b = readMeta;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SleepTimerState invokeSuspend$lambda$0;
        switch (this.f16133a) {
            case 0:
                return ReadBookmarksViewModel$initialize$3.AnonymousClass1.a(this.f16134b, (ReadBookmarksState) obj);
            case 1:
                invokeSuspend$lambda$0 = SleepTimerViewModel.AnonymousClass2.AnonymousClass3.invokeSuspend$lambda$0(this.f16134b, (SleepTimerState) obj);
                return invokeSuspend$lambda$0;
            default:
                return SleepTimerViewModel$setReadId$1$1.d(this.f16134b, (SleepTimerState) obj);
        }
    }
}
