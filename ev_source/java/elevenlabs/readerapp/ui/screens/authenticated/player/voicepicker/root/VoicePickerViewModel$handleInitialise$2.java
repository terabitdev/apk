package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel$handleInitialise$2;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel$handleInitialise$2", f = "VoicePickerViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerViewModel$handleInitialise$2 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerViewModel$handleInitialise$2(VoicePickerViewModel voicePickerViewModel, wn.c<? super VoicePickerViewModel$handleInitialise$2> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerViewModel$handleInitialise$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerViewModel$handleInitialise$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i observeInitData;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            observeInitData = this.this$0.observeInitData();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = observeInitData.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel$handleInitialise$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ VoicePickerViewModel this$0;

        public AnonymousClass1(VoicePickerViewModel voicePickerViewModel) {
            this.this$0 = voicePickerViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VoicePickerContract.State emit$lambda$0(VoicePickerSharedContract.State state, boolean z6, VoicePickerContract.State state2) {
            VoicePickerContract.FilterAndSearchMenuState filterAndSearchMenuState;
            state2.getClass();
            if (!state.canChangeVoices()) {
                filterAndSearchMenuState = VoicePickerContract.FilterAndSearchMenuState.Hidden.INSTANCE;
            } else if (z6) {
                filterAndSearchMenuState = VoicePickerContract.FilterAndSearchMenuState.Shown.INSTANCE;
            } else if (kotlin.jvm.internal.m.c(state2.getFilterAndSearchMenu(), VoicePickerContract.FilterAndSearchMenuState.Shown.INSTANCE)) {
                filterAndSearchMenuState = state2.getFilterAndSearchMenu();
            } else {
                filterAndSearchMenuState = VoicePickerContract.FilterAndSearchMenuState.Hidden.INSTANCE;
            }
            return VoicePickerContract.State.copy$default(state2, VoicePickerTabsStateMapperKt.mapVoicePickerTabs(z6, state, state2.getTabs()), filterAndSearchMenuState, false, 4, null);
        }

        public final Object emit(sn.k kVar, wn.c<? super z> cVar) {
            final boolean booleanValue = ((Boolean) kVar.f31600a).booleanValue();
            final VoicePickerSharedContract.State state = (VoicePickerSharedContract.State) kVar.f31601b;
            this.this$0.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.m
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerContract.State emit$lambda$0;
                    emit$lambda$0 = VoicePickerViewModel$handleInitialise$2.AnonymousClass1.emit$lambda$0(state, booleanValue, (VoicePickerContract.State) obj);
                    return emit$lambda$0;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((sn.k) obj, (wn.c<? super z>) cVar);
        }
    }
}
