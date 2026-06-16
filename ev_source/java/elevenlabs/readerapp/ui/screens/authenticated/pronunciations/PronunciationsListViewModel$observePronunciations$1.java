package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Pronunciation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$observePronunciations$1", f = "PronunciationsListScreen.kt", l = {114}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PronunciationsListViewModel$observePronunciations$1 extends yn.i implements ho.p {
    final /* synthetic */ z $screenShownLogged;
    int label;
    final /* synthetic */ PronunciationsListViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$observePronunciations$1$2", f = "PronunciationsListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/Pronunciation;", "it", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$observePronunciations$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ z $screenShownLogged;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PronunciationsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PronunciationsListViewModel pronunciationsListViewModel, z zVar, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = pronunciationsListViewModel;
            this.$screenShownLogged = zVar;
        }

        public static final PronunciationsListState invokeSuspend$lambda$0(List list, PronunciationsListState pronunciationsListState) {
            return PronunciationsListState.copy$default(pronunciationsListState, list, false, null, null, null, 28, null);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$screenShownLogged, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ho.p
        public final Object invoke(List<Pronunciation> list, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(list, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Logger logger;
            Analytics analytics;
            List list = (List) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                logger = this.this$0.logger;
                ib.i.q("Loaded ", list.size(), " pronunciations", logger, "PronunciationsListScreen");
                if (!this.$screenShownLogged.f20568a) {
                    analytics = this.this$0.analytics;
                    analytics.log(new Analytics.Event.PronunciationsListShown(list.size()));
                    this.$screenShownLogged.f20568a = true;
                }
                this.this$0.queueStateUpdate(new l(list, 1));
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsListViewModel$observePronunciations$1(PronunciationsListViewModel pronunciationsListViewModel, z zVar, wn.c<? super PronunciationsListViewModel$observePronunciations$1> cVar) {
        super(2, cVar);
        this.this$0 = pronunciationsListViewModel;
        this.$screenShownLogged = zVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsListViewModel$observePronunciations$1(this.this$0, this.$screenShownLogged, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PronunciationsListViewModel$observePronunciations$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            this.this$0.queueStateUpdate(new m(2));
            ir.i observePronunciations = this.this$0.pronunciationsService.observePronunciations();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$screenShownLogged, null);
            this.label = 1;
            Object l4 = ir.r.l(observePronunciations, anonymousClass2, this);
            xn.a aVar = xn.a.f37986a;
            if (l4 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
