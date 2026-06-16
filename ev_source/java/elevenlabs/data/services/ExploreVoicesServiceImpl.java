package io.elevenlabs.data.services;

import a7.u;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.ExploreVoiceCollectionsApi;
import io.elevenlabs.data.api.ExploreVoicesApi;
import io.elevenlabs.data.cache.MemoryCache;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.domain.services.ExploreVoicesService;
import ir.m1;
import java.util.ArrayList;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 /2\u00020\u0001:\u0001/B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182(\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00190\u0018*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00190\u0018H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0016¢\u0006\u0004\b'\u0010(J%\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010&J-\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.¨\u00060"}, d2 = {"Lio/elevenlabs/data/services/ExploreVoicesServiceImpl;", "Lio/elevenlabs/domain/services/ExploreVoicesService;", "Lio/elevenlabs/data/api/ExploreVoicesApi;", "api", "Lio/elevenlabs/data/api/ExploreVoiceCollectionsApi;", "collectionsApi", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "voicesDao", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/data/cache/MemoryCache;", "memoryCache", "<init>", "(Lio/elevenlabs/data/api/ExploreVoicesApi;Lio/elevenlabs/data/api/ExploreVoiceCollectionsApi;Lio/elevenlabs/data/database/entities/voices/VoicesDao;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/data/cache/MemoryCache;)V", "", "collectionId", "getVoiceCollectionsCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function2;", "Lwn/c;", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "", "makeRequest", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/ExploreVoiceSections;", "observeSections", "(Lho/p;)Lir/i;", "flow", "Lio/elevenlabs/domain/model/VoiceCollectionWithVoices;", "observeVoiceCollection", "(Ljava/lang/String;Lir/i;)Lir/i;", "Lio/elevenlabs/domain/model/VoiceCollection;", "addVoicesIfPresent", "(Lir/i;)Lir/i;", "readId", "observeReadExploreVoices", "(Ljava/lang/String;)Lir/i;", "observeHomeExploreVoices", "()Lir/i;", "(Ljava/lang/String;Ljava/lang/String;)Lir/i;", "Lio/elevenlabs/data/api/ExploreVoicesApi;", "Lio/elevenlabs/data/api/ExploreVoiceCollectionsApi;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/data/cache/MemoryCache;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreVoicesServiceImpl implements ExploreVoicesService {
    public static final String CACHE_KEY_PREFIX_VOICE_COLLECTIONS = "voice_collections_";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ExploreVoicesApi api;
    private final ExploreVoiceCollectionsApi collectionsApi;
    private final DispatcherFactory dispatcherFactory;
    private final MemoryCache memoryCache;
    private final VoicesDao voicesDao;

    public ExploreVoicesServiceImpl(ExploreVoicesApi exploreVoicesApi, ExploreVoiceCollectionsApi exploreVoiceCollectionsApi, VoicesDao voicesDao, DispatcherFactory dispatcherFactory, MemoryCache memoryCache) {
        exploreVoicesApi.getClass();
        exploreVoiceCollectionsApi.getClass();
        voicesDao.getClass();
        dispatcherFactory.getClass();
        memoryCache.getClass();
        this.api = exploreVoicesApi;
        this.collectionsApi = exploreVoiceCollectionsApi;
        this.voicesDao = voicesDao;
        this.dispatcherFactory = dispatcherFactory;
        this.memoryCache = memoryCache;
    }

    private final ir.i addVoicesIfPresent(final ir.i iVar) {
        return new ir.i() { // from class: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ ExploreVoicesServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$$inlined$map$1$2", f = "ExploreVoicesServiceImpl.kt", l = {59, 50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    Object L$7;
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

                public AnonymousClass2(ir.j jVar, ExploreVoicesServiceImpl exploreVoicesServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = exploreVoicesServiceImpl;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x00d7, code lost:
                
                    if (r10.emit(r9, r0) == r5) goto L32;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    ir.j jVar;
                    int i11;
                    final VoiceCollection voiceCollection;
                    ExploreVoiceCollectionsApi exploreVoiceCollectionsApi;
                    ir.j jVar2;
                    int i12;
                    AsyncCallResult success;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            xn.a aVar = xn.a.f37986a;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        sn.a.g(obj2);
                                        return z.f31622a;
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i12 = anonymousClass1.I$0;
                                voiceCollection = (VoiceCollection) anonymousClass1.L$7;
                                jVar2 = (ir.j) anonymousClass1.L$4;
                                sn.a.g(obj2);
                            } else {
                                sn.a.g(obj2);
                                jVar = this.$this_unsafeFlow;
                                AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                                i11 = 0;
                                if (asyncCallResult instanceof AsyncCallResult.Error) {
                                    success = ((AsyncCallResult.Error) asyncCallResult).cast();
                                } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                                    voiceCollection = (VoiceCollection) ((AsyncCallResult.Success) asyncCallResult).getData();
                                    if (voiceCollection != null) {
                                        exploreVoiceCollectionsApi = this.this$0.collectionsApi;
                                        String id2 = voiceCollection.getId();
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.L$4 = jVar;
                                        anonymousClass1.L$5 = null;
                                        anonymousClass1.L$6 = null;
                                        anonymousClass1.L$7 = voiceCollection;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.I$1 = 0;
                                        anonymousClass1.label = 1;
                                        Object collectionVoices = exploreVoiceCollectionsApi.getCollectionVoices(id2, anonymousClass1);
                                        if (collectionVoices != aVar) {
                                            jVar2 = jVar;
                                            obj2 = collectionVoices;
                                            i12 = 0;
                                        }
                                        return aVar;
                                    }
                                    success = new AsyncCallResult.Success(null);
                                } else {
                                    c6.p();
                                    return null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.L$7 = null;
                                anonymousClass1.I$0 = i11;
                                anonymousClass1.label = 2;
                            }
                            AsyncCallResult domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
                            final ExploreVoicesServiceImpl exploreVoicesServiceImpl = this.this$0;
                            i11 = i12;
                            success = ApiResultExtensionKt.map(domain, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00bd: INVOKE (r9v15 'success' io.elevenlabs.domain.model.AsyncCallResult) = 
                                  (r10v7 'domain' io.elevenlabs.domain.model.AsyncCallResult)
                                  (wrap:ho.l:0x00b5: CONSTRUCTOR 
                                  (r1v5 'voiceCollection' io.elevenlabs.domain.model.VoiceCollection A[DONT_INLINE])
                                  (r7v1 'exploreVoicesServiceImpl' io.elevenlabs.data.services.ExploreVoicesServiceImpl A[DONT_INLINE])
                                 A[MD:(io.elevenlabs.domain.model.VoiceCollection, io.elevenlabs.data.services.ExploreVoicesServiceImpl):void (m), WRAPPED] (LINE:182) call: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$1$1.<init>(io.elevenlabs.domain.model.VoiceCollection, io.elevenlabs.data.services.ExploreVoicesServiceImpl):void type: CONSTRUCTOR)
                                 STATIC call: io.elevenlabs.data.extensions.ApiResultExtensionKt.map(io.elevenlabs.domain.model.AsyncCallResult, ho.l):io.elevenlabs.domain.model.AsyncCallResult A[MD:<T, R>:(io.elevenlabs.domain.model.AsyncCallResult<T>, ho.l):io.elevenlabs.domain.model.AsyncCallResult<R> (m)] (LINE:185) in method: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 27 more
                                */
                            /*
                                Method dump skipped, instructions count: 226
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.ExploreVoicesServiceImpl$addVoicesIfPresent$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getVoiceCollectionsCacheKey(String collectionId) {
                return defpackage.f.i(CACHE_KEY_PREFIX_VOICE_COLLECTIONS, collectionId);
            }

            private final ir.i observeSections(p makeRequest) {
                final m1 m1Var = new m1(new ExploreVoicesServiceImpl$observeSections$1(this, makeRequest, null));
                return new ir.i() { // from class: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;
                        final /* synthetic */ ExploreVoicesServiceImpl this$0;

                        @yn.e(c = "io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2", f = "ExploreVoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes3.dex */
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

                        public AnonymousClass2(ir.j jVar, ExploreVoicesServiceImpl exploreVoicesServiceImpl) {
                            this.$this_unsafeFlow = jVar;
                            this.this$0 = exploreVoicesServiceImpl;
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
                            VoicesDao voicesDao;
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
                                        final ArrayList arrayList = new ArrayList();
                                        AsyncCallResult domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                                        final ExploreVoicesServiceImpl exploreVoicesServiceImpl = this.this$0;
                                        AsyncCallResult map = ApiResultExtensionKt.map(domain, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: INVOKE (r6v3 'map' io.elevenlabs.domain.model.AsyncCallResult) = 
                                              (r6v2 'domain' io.elevenlabs.domain.model.AsyncCallResult)
                                              (wrap:ho.l:0x0048: CONSTRUCTOR 
                                              (r1v1 'arrayList' java.util.ArrayList A[DONT_INLINE])
                                              (r4v0 'exploreVoicesServiceImpl' io.elevenlabs.data.services.ExploreVoicesServiceImpl A[DONT_INLINE])
                                             A[MD:(java.util.List<io.elevenlabs.data.database.entities.voices.VoiceEntity>, io.elevenlabs.data.services.ExploreVoicesServiceImpl):void (m), WRAPPED] (LINE:73) call: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$2$1.<init>(java.util.List, io.elevenlabs.data.services.ExploreVoicesServiceImpl):void type: CONSTRUCTOR)
                                             STATIC call: io.elevenlabs.data.extensions.ApiResultExtensionKt.map(io.elevenlabs.domain.model.AsyncCallResult, ho.l):io.elevenlabs.domain.model.AsyncCallResult A[DECLARE_VAR, MD:<T, R>:(io.elevenlabs.domain.model.AsyncCallResult<T>, ho.l):io.elevenlabs.domain.model.AsyncCallResult<R> (m)] (LINE:76) in method: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
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
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$2$1, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 33 more
                                            */
                                        /*
                                            this = this;
                                            boolean r0 = r7 instanceof io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                            if (r0 == 0) goto L13
                                            r0 = r7
                                            io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2$1 r0 = (io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                            int r1 = r0.label
                                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                            r3 = r1 & r2
                                            if (r3 == 0) goto L13
                                            int r1 = r1 - r2
                                            r0.label = r1
                                            goto L18
                                        L13:
                                            io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2$1 r0 = new io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2$1
                                            r0.<init>(r7)
                                        L18:
                                            java.lang.Object r7 = r0.result
                                            int r1 = r0.label
                                            r2 = 1
                                            if (r1 == 0) goto L34
                                            if (r1 != r2) goto L2d
                                            java.lang.Object r6 = r0.L$3
                                            ir.j r6 = (ir.j) r6
                                            java.lang.Object r6 = r0.L$1
                                            io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1$2$1 r6 = (io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                                            sn.a.g(r7)
                                            goto L6f
                                        L2d:
                                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                            com.google.protobuf.c6.x(r6)
                                            r6 = 0
                                            return r6
                                        L34:
                                            sn.a.g(r7)
                                            ir.j r7 = r5.$this_unsafeFlow
                                            io.elevenlabs.data.model.ApiResult r6 = (io.elevenlabs.data.model.ApiResult) r6
                                            java.util.ArrayList r1 = new java.util.ArrayList
                                            r1.<init>()
                                            io.elevenlabs.domain.model.AsyncCallResult r6 = io.elevenlabs.data.extensions.ApiResultExtensionKt.toDomain(r6)
                                            io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$2$1 r3 = new io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$2$1
                                            io.elevenlabs.data.services.ExploreVoicesServiceImpl r4 = r5.this$0
                                            r3.<init>(r1, r4)
                                            io.elevenlabs.domain.model.AsyncCallResult r6 = io.elevenlabs.data.extensions.ApiResultExtensionKt.map(r6, r3)
                                            io.elevenlabs.data.services.ExploreVoicesServiceImpl r3 = r5.this$0
                                            io.elevenlabs.data.database.entities.voices.VoicesDao r3 = io.elevenlabs.data.services.ExploreVoicesServiceImpl.access$getVoicesDao$p(r3)
                                            r3.insertAll(r1)
                                            r1 = 0
                                            r0.L$0 = r1
                                            r0.L$1 = r1
                                            r0.L$2 = r1
                                            r0.L$3 = r1
                                            r1 = 0
                                            r0.I$0 = r1
                                            r0.label = r2
                                            java.lang.Object r6 = r7.emit(r6, r0)
                                            xn.a r7 = xn.a.f37986a
                                            if (r6 != r7) goto L6f
                                            return r7
                                        L6f:
                                            sn.z r6 = sn.z.f31622a
                                            return r6
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeSections$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                                    }
                                }

                                @Override // ir.i
                                public Object collect(ir.j jVar, wn.c cVar) {
                                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                                    if (collect == xn.a.f37986a) {
                                        return collect;
                                    }
                                    return z.f31622a;
                                }
                            };
                        }

                        private final ir.i observeVoiceCollection(final String collectionId, final ir.i flow) {
                            VoiceCollection voiceCollection = (VoiceCollection) this.memoryCache.get(getVoiceCollectionsCacheKey(collectionId));
                            if (voiceCollection != null) {
                                return addVoicesIfPresent(new u(new AsyncCallResult.Success(voiceCollection), 3));
                            }
                            return addVoicesIfPresent(new ir.i() { // from class: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1

                                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                                /* renamed from: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2, reason: invalid class name */
                                /* loaded from: classes3.dex */
                                public static final class AnonymousClass2<T> implements ir.j {
                                    final /* synthetic */ String $collectionId$inlined;
                                    final /* synthetic */ ir.j $this_unsafeFlow;

                                    @yn.e(c = "io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2", f = "ExploreVoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                                    /* renamed from: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2$1, reason: invalid class name */
                                    /* loaded from: classes3.dex */
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

                                    public AnonymousClass2(ir.j jVar, String str) {
                                        this.$this_unsafeFlow = jVar;
                                        this.$collectionId$inlined = str;
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
                                                    final String str = this.$collectionId$inlined;
                                                    AsyncCallResult map = ApiResultExtensionKt.map((AsyncCallResult) obj, 
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0042: INVOKE (r5v2 'map' io.elevenlabs.domain.model.AsyncCallResult) = 
                                                          (wrap:io.elevenlabs.domain.model.AsyncCallResult:0x0039: CHECK_CAST (io.elevenlabs.domain.model.AsyncCallResult) (r5v0 'obj' java.lang.Object))
                                                          (wrap:ho.l:0x003f: CONSTRUCTOR (r3v0 'str' java.lang.String A[DONT_INLINE]) A[MD:(java.lang.String):void (m), WRAPPED] (LINE:64) call: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$1$1.<init>(java.lang.String):void type: CONSTRUCTOR)
                                                         STATIC call: io.elevenlabs.data.extensions.ApiResultExtensionKt.map(io.elevenlabs.domain.model.AsyncCallResult, ho.l):io.elevenlabs.domain.model.AsyncCallResult A[DECLARE_VAR, MD:<T, R>:(io.elevenlabs.domain.model.AsyncCallResult<T>, ho.l):io.elevenlabs.domain.model.AsyncCallResult<R> (m)] (LINE:67) in method: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
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
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$1$1, state: NOT_LOADED
                                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                        	... 33 more
                                                        */
                                                    /*
                                                        this = this;
                                                        boolean r0 = r6 instanceof io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                                        if (r0 == 0) goto L13
                                                        r0 = r6
                                                        io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2$1 r0 = (io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                                        int r1 = r0.label
                                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                        r3 = r1 & r2
                                                        if (r3 == 0) goto L13
                                                        int r1 = r1 - r2
                                                        r0.label = r1
                                                        goto L18
                                                    L13:
                                                        io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2$1 r0 = new io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2$1
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
                                                        io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1$2$1 r5 = (io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                                                        sn.a.g(r6)
                                                        goto L5d
                                                    L2d:
                                                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                                        com.google.protobuf.c6.x(r5)
                                                        r5 = 0
                                                        return r5
                                                    L34:
                                                        sn.a.g(r6)
                                                        ir.j r6 = r4.$this_unsafeFlow
                                                        io.elevenlabs.domain.model.AsyncCallResult r5 = (io.elevenlabs.domain.model.AsyncCallResult) r5
                                                        io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$1$1 r1 = new io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$1$1
                                                        java.lang.String r3 = r4.$collectionId$inlined
                                                        r1.<init>(r3)
                                                        io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.map(r5, r1)
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
                                                        if (r5 != r6) goto L5d
                                                        return r6
                                                    L5d:
                                                        sn.z r5 = sn.z.f31622a
                                                        return r5
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.ExploreVoicesServiceImpl$observeVoiceCollection$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                                                }
                                            }

                                            @Override // ir.i
                                            public Object collect(ir.j jVar, wn.c cVar) {
                                                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, collectionId), cVar);
                                                if (collect == xn.a.f37986a) {
                                                    return collect;
                                                }
                                                return z.f31622a;
                                            }
                                        });
                                    }

                                    @Override // io.elevenlabs.domain.services.ExploreVoicesService
                                    public ir.i observeHomeExploreVoices() {
                                        return observeSections(new ExploreVoicesServiceImpl$observeHomeExploreVoices$1(this, null));
                                    }

                                    @Override // io.elevenlabs.domain.services.ExploreVoicesService
                                    public ir.i observeReadExploreVoices(String readId) {
                                        readId.getClass();
                                        return observeSections(new ExploreVoicesServiceImpl$observeReadExploreVoices$1(this, readId, null));
                                    }

                                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/services/ExploreVoicesServiceImpl$Companion;", "", "<init>", "()V", "CACHE_KEY_PREFIX_VOICE_COLLECTIONS", "", "getCACHE_KEY_PREFIX_VOICE_COLLECTIONS$annotations", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                                    /* loaded from: classes3.dex */
                                    public static final class Companion {
                                        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                                            this();
                                        }

                                        private Companion() {
                                        }

                                        public static /* synthetic */ void getCACHE_KEY_PREFIX_VOICE_COLLECTIONS$annotations() {
                                        }
                                    }

                                    @Override // io.elevenlabs.domain.services.ExploreVoicesService
                                    public ir.i observeVoiceCollection(String collectionId, String readId) {
                                        collectionId.getClass();
                                        readId.getClass();
                                        return observeVoiceCollection(collectionId, observeReadExploreVoices(readId));
                                    }

                                    @Override // io.elevenlabs.domain.services.ExploreVoicesService
                                    public ir.i observeVoiceCollection(String collectionId) {
                                        collectionId.getClass();
                                        return observeVoiceCollection(collectionId, observeHomeExploreVoices());
                                    }
                                }
