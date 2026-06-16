package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import com.google.firebase.sessions.s;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import ir.h1;
import ir.j1;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$produceUiState$1", f = "VoicePickerExploreViewModel.kt", l = {227}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel$produceUiState$1 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerExploreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerExploreViewModel$produceUiState$1(VoicePickerExploreViewModel voicePickerExploreViewModel, wn.c<? super VoicePickerExploreViewModel$produceUiState$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerExploreViewModel;
    }

    public static final boolean invokeSuspend$lambda$0(VoicePickerSharedContract.State state, VoicePickerSharedContract.State state2) {
        if (m.c(state.getReadMeta(), state2.getReadMeta()) && state.isVoiceChangerEnabled() == state2.isVoiceChangerEnabled()) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ Object invokeSuspend$lambda$1(VoicePickerExploreContract.State state, VoicePickerSharedContract.State state2, wn.c cVar) {
        return new k(state, state2);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerExploreViewModel$produceUiState$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerExploreViewModel$produceUiState$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        z zVar = z.f31622a;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            z1 stateFlow = this.this$0.getStateFlow();
            z1 sharedStateFlow = this.this$0.getSharedStateFlow();
            j jVar = new j(0);
            a2.p pVar = r.f18031a;
            i0.d(2, jVar);
            ir.g p10 = r.p(sharedStateFlow, pVar, jVar);
            AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
            AnonymousClass5 anonymousClass5 = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$produceUiState$1.5
                public AnonymousClass5() {
                }

                public final Object emit(k kVar, wn.c<? super z> cVar) {
                    j1 j1Var;
                    VoicePickerExploreStateMapper voicePickerExploreStateMapper;
                    VoicePickerExploreContract.State state = (VoicePickerExploreContract.State) kVar.f31600a;
                    VoicePickerSharedContract.State state2 = (VoicePickerSharedContract.State) kVar.f31601b;
                    j1Var = VoicePickerExploreViewModel.this.mutableUiStateFlow;
                    voicePickerExploreStateMapper = VoicePickerExploreViewModel.this.mapper;
                    Object emit = j1Var.emit(voicePickerExploreStateMapper.mapState((VoicePickerExploreContract.UiState) VoicePickerExploreViewModel.this.getUiStateFlow().getValue(), state, state2), cVar);
                    if (emit == xn.a.f37986a) {
                        return emit;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((k) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object a10 = jr.b.a(h1.f17948a, new s(anonymousClass4, (wn.c) null, 3), anonymousClass5, this, new ir.i[]{stateFlow, p10});
            xn.a aVar = xn.a.f37986a;
            if (a10 != aVar) {
                a10 = zVar;
            }
            if (a10 == aVar) {
                return aVar;
            }
        }
        return zVar;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$produceUiState$1$4 */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class AnonymousClass4 extends kotlin.jvm.internal.a implements q {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // ho.q
        public final Object invoke(VoicePickerExploreContract.State state, VoicePickerSharedContract.State state2, wn.c<? super k> cVar) {
            return VoicePickerExploreViewModel$produceUiState$1.invokeSuspend$lambda$1(state, state2, cVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$produceUiState$1$5 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5<T> implements ir.j {
        public AnonymousClass5() {
        }

        public final Object emit(k kVar, wn.c<? super z> cVar) {
            j1 j1Var;
            VoicePickerExploreStateMapper voicePickerExploreStateMapper;
            VoicePickerExploreContract.State state = (VoicePickerExploreContract.State) kVar.f31600a;
            VoicePickerSharedContract.State state2 = (VoicePickerSharedContract.State) kVar.f31601b;
            j1Var = VoicePickerExploreViewModel.this.mutableUiStateFlow;
            voicePickerExploreStateMapper = VoicePickerExploreViewModel.this.mapper;
            Object emit = j1Var.emit(voicePickerExploreStateMapper.mapState((VoicePickerExploreContract.UiState) VoicePickerExploreViewModel.this.getUiStateFlow().getValue(), state, state2), cVar);
            if (emit == xn.a.f37986a) {
                return emit;
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
            return emit((k) obj2, (wn.c<? super z>) cVar);
        }
    }
}
