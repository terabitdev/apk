package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.g0;
import fr.k1;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.m1;
import ir.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Ljl/a;)V", "", "query", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onQueryChanged", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "readId", "Lsn/z;", "bindReadId", "(Ljava/lang/String;)V", "Ljl/a;", "Lfr/k1;", "loadJob", "Lfr/k1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContentSearchViewModel extends MviViewModel<ContentSearchState> {
    public static final int $stable = 8;
    private k1 loadJob;
    private final jl.a readsService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1", f = "ContentSearchSheet.kt", l = {122}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$3", f = "ContentSearchSheet.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentSearchViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ContentSearchViewModel contentSearchViewModel, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = contentSearchViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ContentSearchState invokeSuspend$lambda$0(List list, ContentSearchState contentSearchState) {
                return ContentSearchState.copy$default(contentSearchState, null, null, false, null, list, 11, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // ho.p
            public final Object invoke(List<String> list, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass3) create(list, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new l(list, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                final z1 stateFlow = ContentSearchViewModel.this.getStateFlow();
                final ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ContentSearchSheet.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        ContentSearchState contentSearchState = (ContentSearchState) obj;
                                        SearchAction searchAction = new SearchAction(contentSearchState.getQuery(), contentSearchState.getPattern(), contentSearchState.getHtmlElements());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(searchAction, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                };
                xq.a aVar = xq.b.f38124b;
                long N = g0.N(xq.g.n(200, xq.d.MILLISECONDS));
                if (N >= 0) {
                    if (N != 0) {
                        iVar = new m1(new ir.o(new a2.g(N, 6), iVar, null));
                    }
                    ir.i iVar2 = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass2<T> implements ir.j {
                            final /* synthetic */ ir.j $this_unsafeFlow;

                            @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2", f = "ContentSearchSheet.kt", l = {50}, m = "emit", v = 2)
                            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                            /* loaded from: classes4.dex */
                            public static final class AnonymousClass1 extends yn.c {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(wn.c cVar) {
                                    super(cVar);
                                }

                                @Override // yn.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(ir.j jVar) {
                                this.$this_unsafeFlow = jVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                            @Override // ir.j
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, wn.c cVar) {
                                AnonymousClass1 anonymousClass1;
                                int i10;
                                Object u02;
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i11 = anonymousClass1.label;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        i10 = anonymousClass1.label;
                                        if (i10 == 0) {
                                            if (i10 == 1) {
                                                sn.a.g(obj2);
                                            } else {
                                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                        } else {
                                            sn.a.g(obj2);
                                            ir.j jVar = this.$this_unsafeFlow;
                                            final SearchAction searchAction = (SearchAction) obj;
                                            if (searchAction.getQuery().length() < 3) {
                                                u02 = tn.t.f33547a;
                                            } else {
                                                u02 = vq.k.u0(vq.k.t0(new vq.f(tn.o.j0(searchAction.getElements()), true, 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0061: INVOKE (r5v4 'u02' java.lang.Object) = 
                                                      (wrap:vq.h:0x005d: INVOKE 
                                                      (wrap:vq.f:0x0058: CONSTRUCTOR 
                                                      (wrap:eo.m:0x004d: INVOKE 
                                                      (wrap:java.util.List<java.lang.String>:0x0049: INVOKE (r5v1 'searchAction' io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction) VIRTUAL call: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction.getElements():java.util.List A[MD:():java.util.List<java.lang.String> (m), WRAPPED] (LINE:74))
                                                     STATIC call: tn.o.j0(java.lang.Iterable):eo.m A[MD:(java.lang.Iterable):eo.m (m), WRAPPED] (LINE:78))
                                                      true
                                                      (wrap:ho.l:0x0053: CONSTRUCTOR (r5v1 'searchAction' io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction A[DONT_INLINE]) A[MD:(io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction):void (m), WRAPPED] (LINE:84) call: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$2$1.<init>(io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction):void type: CONSTRUCTOR)
                                                     A[MD:(vq.h, boolean, ho.l):void (m), WRAPPED] (LINE:89) call: vq.f.<init>(vq.h, boolean, ho.l):void type: CONSTRUCTOR)
                                                      (100 int)
                                                     STATIC call: vq.k.t0(vq.h, int):vq.h A[MD:(vq.h, int):vq.h (m), WRAPPED] (LINE:94))
                                                     STATIC call: vq.k.u0(vq.h):java.util.List A[MD:(vq.h):java.util.List (m)] (LINE:98) in method: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes4.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$2$1, state: NOT_LOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:777)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                    	... 39 more
                                                    */
                                                /*
                                                    this = this;
                                                    boolean r0 = r6 instanceof io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1
                                                    if (r0 == 0) goto L13
                                                    r0 = r6
                                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1 r0 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                                                    int r1 = r0.label
                                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                    r3 = r1 & r2
                                                    if (r3 == 0) goto L13
                                                    int r1 = r1 - r2
                                                    r0.label = r1
                                                    goto L18
                                                L13:
                                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1 r0 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1
                                                    r0.<init>(r6)
                                                L18:
                                                    java.lang.Object r6 = r0.result
                                                    int r1 = r0.label
                                                    r2 = 1
                                                    if (r1 == 0) goto L34
                                                    if (r1 != r2) goto L2d
                                                    java.lang.Object r5 = r0.L$3
                                                    ir.j r5 = (ir.j) r5
                                                    java.lang.Object r5 = r0.L$1
                                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1 r5 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r5
                                                    sn.a.g(r6)
                                                    goto L7c
                                                L2d:
                                                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                                    com.google.protobuf.c6.x(r5)
                                                    r5 = 0
                                                    return r5
                                                L34:
                                                    sn.a.g(r6)
                                                    ir.j r6 = r4.$this_unsafeFlow
                                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction r5 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SearchAction) r5
                                                    java.lang.String r1 = r5.getQuery()
                                                    int r1 = r1.length()
                                                    r3 = 3
                                                    if (r1 >= r3) goto L49
                                                    tn.t r5 = tn.t.f33547a
                                                    goto L65
                                                L49:
                                                    java.util.List r1 = r5.getElements()
                                                    eo.m r1 = tn.o.j0(r1)
                                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$2$1 r3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$2$1
                                                    r3.<init>(r5)
                                                    vq.f r5 = new vq.f
                                                    r5.<init>(r1, r2, r3)
                                                    r1 = 100
                                                    vq.h r5 = vq.k.t0(r5, r1)
                                                    java.util.List r5 = vq.k.u0(r5)
                                                L65:
                                                    r1 = 0
                                                    r0.L$0 = r1
                                                    r0.L$1 = r1
                                                    r0.L$2 = r1
                                                    r0.L$3 = r1
                                                    r1 = 0
                                                    r0.I$0 = r1
                                                    r0.label = r2
                                                    java.lang.Object r5 = r6.emit(r5, r0)
                                                    xn.a r6 = xn.a.f37986a
                                                    if (r5 != r6) goto L7c
                                                    return r6
                                                L7c:
                                                    sn.z r5 = sn.z.f31622a
                                                    return r5
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                                            }
                                        }

                                        @Override // ir.i
                                        public Object collect(ir.j jVar, wn.c cVar) {
                                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                                            if (collect == xn.a.f37986a) {
                                                return collect;
                                            }
                                            return sn.z.f31622a;
                                        }
                                    };
                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(ContentSearchViewModel.this, null);
                                    this.label = 1;
                                    Object l4 = ir.r.l(iVar2, anonymousClass3, this);
                                    xn.a aVar2 = xn.a.f37986a;
                                    if (l4 == aVar2) {
                                        return aVar2;
                                    }
                                } else {
                                    c6.t("Debounce timeout should not be negative");
                                    return null;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ContentSearchViewModel(DispatcherFactory dispatcherFactory, Logger logger, jl.a aVar) {
                        super(new ContentSearchState(null, null, false, null, null, 31, null), dispatcherFactory, logger);
                        dispatcherFactory.getClass();
                        logger.getClass();
                        aVar.getClass();
                        this.readsService = aVar;
                        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ContentSearchState bindReadId$lambda$0(ContentSearchState contentSearchState) {
                        contentSearchState.getClass();
                        return ContentSearchState.copy$default(contentSearchState, null, null, false, tn.t.f33547a, null, 23, null);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ContentSearchState onQueryChanged$lambda$0(String str, ContentSearchState contentSearchState) {
                        List<String> list;
                        contentSearchState.getClass();
                        String obj = wq.n.L0(str).toString();
                        Pattern compile = Pattern.compile("\\s+");
                        compile.getClass();
                        obj.getClass();
                        int i10 = 0;
                        wq.n.x0(0);
                        Matcher matcher = compile.matcher(obj);
                        if (!matcher.find()) {
                            list = ig.f.H(obj.toString());
                        } else {
                            ArrayList arrayList = new ArrayList(10);
                            do {
                                arrayList.add(obj.subSequence(i10, matcher.start()).toString());
                                i10 = matcher.end();
                            } while (matcher.find());
                            arrayList.add(obj.subSequence(i10, obj.length()).toString());
                            list = arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(tn.p.a0(list, 10));
                        for (String str2 : list) {
                            str2.getClass();
                            String quote = Pattern.quote(str2);
                            quote.getClass();
                            arrayList2.add(quote);
                        }
                        return ContentSearchState.copy$default(contentSearchState, str, new wq.l("(?i)".concat(tn.o.E0(arrayList2, "\\s+", null, null, null, 62))), true, null, tn.t.f33547a, 8, null);
                    }

                    public final void bindReadId(String readId) {
                        readId.getClass();
                        k1 k1Var = this.loadJob;
                        if (k1Var != null) {
                            k1Var.cancel((CancellationException) null);
                        }
                        queueStateUpdate(new o(12));
                        this.loadJob = g0.D(c1.h(this), getDispatcherFactory().getIo(), null, new ContentSearchViewModel$bindReadId$2(this, readId, null), 2);
                    }

                    public final MviViewModel.StateUpdate onQueryChanged(String query) {
                        query.getClass();
                        return queueStateUpdate(new k(query, 0));
                    }
                }
