package io.elevenlabs.data.services;

import a2.o0;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.u0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import eo.m;
import fr.d0;
import fr.e0;
import fr.g0;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsUploadAPI;
import io.elevenlabs.data.database.entities.reads.ReadChapterEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.reads.SampleConfigEntity;
import io.elevenlabs.data.database.entities.reads.SyncState;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.FileDownloadExtensionKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyRateAReadReadsReadIdRatePost;
import io.elevenlabs.data.model.ReadUpdateModel;
import io.elevenlabs.data.model.request.FileDataRequestBody;
import io.elevenlabs.data.model.request.RedeemCodeRequest;
import io.elevenlabs.data.model.response.LimitedBasedReadApiErrorData;
import io.elevenlabs.data.model.response.RateReadResponseModel;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.services.optimized.ChapterContentBlob;
import io.elevenlabs.data.services.optimized.ChapterContentMemoryCache;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import io.elevenlabs.data.services.optimized.OptimizedReadIndexBlob;
import io.elevenlabs.data.services.optimized.OptimizedReadSplitter;
import io.elevenlabs.data.worker.OfflineReadsDownloader;
import io.elevenlabs.data.worker.SyncListeningPositionWorker;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterSlotIndex;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.FileData;
import io.elevenlabs.domain.model.FileDownloadState;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.ReadShareResult;
import io.elevenlabs.domain.services.AddPodcastResult;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.MakePodcastResult;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.livekit.android.room.SignalClient;
import ir.k1;
import ir.m1;
import ir.n1;
import ir.q1;
import ir.r;
import ir.t1;
import ir.w;
import ir.y1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import okhttp3.MultipartBody;
import okhttp3.internal._UtilJvmKt;
import oo.u;
import sn.z;
import tn.o;
import tn.p;
import tn.t;
import tn.y;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\u0018\u00002\u00020\u0001:\u0002·\u0001B§\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.H\u0086@¢\u0006\u0004\b/\u00100J6\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908072\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u000205H\u0096@¢\u0006\u0004\b:\u0010;J,\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020908072\u0006\u0010=\u001a\u00020<2\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b>\u0010?J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u000203072\u0006\u0010@\u001a\u00020<H\u0096@¢\u0006\u0004\bA\u0010BJ$\u0010D\u001a\b\u0012\u0004\u0012\u00020<082\f\u0010C\u001a\b\u0012\u0004\u0012\u00020<08H\u0096@¢\u0006\u0004\bD\u0010EJ\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020G072\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bH\u0010BJ \u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u0001082\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bJ\u0010BJ\"\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010F\u001a\u00020<2\u0006\u0010K\u001a\u000201H\u0096@¢\u0006\u0004\bM\u0010?J\u001e\u0010N\u001a\b\u0012\u0004\u0012\u00020L072\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bN\u0010BJ\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00020.0O2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bP\u0010BJ\u001f\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109072\u0006\u0010@\u001a\u00020<H\u0016¢\u0006\u0004\bQ\u0010RJ\u001a\u0010S\u001a\u0004\u0018\u0001092\u0006\u0010@\u001a\u00020<H\u0096@¢\u0006\u0004\bS\u0010BJ$\u0010:\u001a\b\u0012\u0004\u0012\u000209082\f\u0010C\u001a\b\u0012\u0004\u0012\u00020<08H\u0096@¢\u0006\u0004\b:\u0010EJ&\u0010U\u001a\b\u0012\u0004\u0012\u00020.0O2\u0006\u0010@\u001a\u00020<2\u0006\u0010T\u001a\u00020<H\u0096@¢\u0006\u0004\bU\u0010VJ&\u0010X\u001a\b\u0012\u0004\u0012\u0002090O2\u0006\u0010@\u001a\u00020<2\u0006\u0010W\u001a\u000203H\u0096@¢\u0006\u0004\bX\u0010YJ$\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090O072\u0006\u0010@\u001a\u00020<H\u0096@¢\u0006\u0004\bZ\u0010BJ\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00020[072\u0006\u0010@\u001a\u00020<H\u0096@¢\u0006\u0004\b\\\u0010BJ:\u0010b\u001a\b\u0012\u0004\u0012\u0002090O2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020<2\b\u0010`\u001a\u0004\u0018\u00010<2\b\u0010a\u001a\u0004\u0018\u00010<H\u0096@¢\u0006\u0004\bb\u0010cJ:\u0010e\u001a\b\u0012\u0004\u0012\u00020d0O2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020<2\b\u0010`\u001a\u0004\u0018\u00010<2\b\u0010a\u001a\u0004\u0018\u00010<H\u0096@¢\u0006\u0004\be\u0010cJ\u0018\u0010f\u001a\u0002032\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bf\u0010BJ \u0010i\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\u0006\u0010h\u001a\u00020gH\u0096@¢\u0006\u0004\bi\u0010jJ(\u0010n\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\u0006\u0010k\u001a\u00020<2\u0006\u0010m\u001a\u00020lH\u0096@¢\u0006\u0004\bn\u0010oJ \u0010p\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\u0006\u0010`\u001a\u00020<H\u0096@¢\u0006\u0004\bp\u0010VJ \u0010r\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\u0006\u0010q\u001a\u00020<H\u0096@¢\u0006\u0004\br\u0010VJ\u001e\u0010t\u001a\b\u0012\u0004\u0012\u00020s0O2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bt\u0010BJ&\u0010v\u001a\b\u0012\u0004\u0012\u00020.0O2\u0006\u0010F\u001a\u00020<2\u0006\u0010u\u001a\u00020gH\u0096@¢\u0006\u0004\bv\u0010jJ\u001e\u0010x\u001a\b\u0012\u0004\u0012\u00020w0O2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\bx\u0010BJ\u001e\u0010y\u001a\b\u0012\u0004\u0012\u00020.0O2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\by\u0010BJ&\u0010{\u001a\b\u0012\u0004\u0012\u0002090O2\u0006\u0010z\u001a\u00020<2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\b{\u0010VJ\u0018\u0010|\u001a\u00020.2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\b|\u0010BJ\u0018\u0010}\u001a\u00020.2\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0004\b}\u0010BJ \u0010\u007f\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\u0006\u0010~\u001a\u000203H\u0096@¢\u0006\u0004\b\u007f\u0010YJ'\u0010\u0081\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010O072\u0006\u0010F\u001a\u00020<H\u0096@¢\u0006\u0005\b\u0081\u0001\u0010BJ\u001b\u0010\u0083\u0001\u001a\u0002032\u0007\u0010\u0082\u0001\u001a\u00020<H\u0096@¢\u0006\u0005\b\u0083\u0001\u0010BJ%\u0010\u0086\u0001\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J7\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020<2\b\u0010`\u001a\u0004\u0018\u00010<2\b\u0010a\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J%\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010F\u001a\u00020<2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010<H\u0082@¢\u0006\u0005\b\u008c\u0001\u0010VJ\u001d\u0010\u008f\u0001\u001a\u00020.2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0082@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0091\u0001\u001a\u00020.2\u0006\u0010F\u001a\u00020<H\u0082@¢\u0006\u0005\b\u0091\u0001\u0010BJ\u001a\u0010\u0092\u0001\u001a\u00020.2\u0006\u0010F\u001a\u00020<H\u0082@¢\u0006\u0005\b\u0092\u0001\u0010BJ&\u0010\u0094\u0001\u001a\u00030\u0084\u00012\u0006\u0010@\u001a\u00020<2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0096\u0001\u001a\u00030\u0084\u00012\u0006\u0010F\u001a\u00020<H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0098\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0099\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u009a\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u009b\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u009c\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u009d\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u009e\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u009f\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010 \u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¡\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010¢\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010£\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010¤\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010¥\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010¦\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010§\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010¨\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010©\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010ª\u0001R\u0017\u0010«\u0001\u001a\u00020<8\u0002X\u0082D¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R3\u0010´\u0001\u001a\u00020g2\u0007\u0010\u00ad\u0001\u001a\u00020g8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u0019\u0010µ\u0001\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001¨\u0006¸\u0001"}, d2 = {"Lio/elevenlabs/data/services/ReadsServiceImpl;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/data/api/ReadsUploadAPI;", "readsUploadAPI", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "readsDao", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/data/api/ReadsAPI;", "readsAPI", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lvr/c;", "json", "Lfr/d0;", "coroutineScope", "Landroid/content/SharedPreferences;", "userSharedPreferences", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Landroid/content/Context;", "appContext", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/data/services/ReadMetadataSaver;", "readMetadataSaver", "Lio/elevenlabs/data/services/optimized/OptimizedReadCache;", "optimizedReadCache", "Lio/elevenlabs/data/services/optimized/OptimizedReadSplitter;", "optimizedReadSplitter", "Lio/elevenlabs/data/services/optimized/ChapterContentMemoryCache;", "chapterMemoryCache", "<init>", "(Lio/elevenlabs/domain/services/FileService;Lio/elevenlabs/data/api/ReadsUploadAPI;Lio/elevenlabs/data/database/entities/reads/ReadsDao;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/data/api/ReadsAPI;Lio/elevenlabs/domain/DispatcherFactory;Lvr/c;Lfr/d0;Landroid/content/SharedPreferences;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Landroid/content/Context;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/data/services/ReadMetadataSaver;Lio/elevenlabs/data/services/optimized/OptimizedReadCache;Lio/elevenlabs/data/services/optimized/OptimizedReadSplitter;Lio/elevenlabs/data/services/optimized/ChapterContentMemoryCache;)V", "Lir/n1;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/n1;", "Lsn/z;", "flushListeningPositions", "(Lwn/c;)Ljava/lang/Object;", "", "limit", "", "archived", "Lio/elevenlabs/domain/services/ReadsService$SortBy;", "sortBy", "Lir/i;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getReads", "(ILjava/lang/Boolean;Lio/elevenlabs/domain/services/ReadsService$SortBy;Lwn/c;)Ljava/lang/Object;", "", "query", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "id", "isReadInLibrary", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "ids", "filterReadsInLibrary", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "readId", "Lio/elevenlabs/domain/model/OptimizedReadPreparation;", "prepareOptimizedRead", "Lio/elevenlabs/domain/model/ChapterSlotIndex;", "loadOptimizedReadIndex", "chapterIndex", "Lio/elevenlabs/domain/model/ChapterContent;", "loadChapterContent", "loadAllChapterContent", "Lio/elevenlabs/domain/model/AsyncCallResult;", "addExploreRead", "observeRead", "(Ljava/lang/String;)Lir/i;", "getRead", "code", "redeemRead", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "saveToLibrary", "refreshRead", "(Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "getReadDetails", "Lio/elevenlabs/domain/model/FileDownloadState;", "getReadHtml", "Lio/elevenlabs/domain/model/FileData;", "file", "source", "title", "sourceUrl", "addUpload", "(Lio/elevenlabs/domain/model/FileData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/AddPodcastResult;", "addPodcast", "remove", "", "offset", "updateLastCharacterOffset", "(Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "audioFileNumber", "", "positionSeconds", "updateAudioPosition", "(Ljava/lang/String;Ljava/lang/String;DLwn/c;)Ljava/lang/Object;", "updateTitle", "lastUsedVoiceId", "updateLastUsedVoiceId", "Lio/elevenlabs/domain/services/MakePodcastResult;", "makePodcast", MetaStatKeys.KEY_RATING, "rateRead", "Lio/elevenlabs/domain/model/ReadShareResult;", "shareRead", "retryPodcast", "ownerId", "addSharedRead", "archive", "unarchive", "markedAsUnread", "markAsUnread", "Lio/elevenlabs/domain/model/ReadDetailsResponse;", "getReadDetailsSections", "parentReadId", "removeSampleReadFromLibrary", "Ljava/io/File;", "htmlFile", "splitAndCacheIfNeeded", "(Ljava/lang/String;Ljava/io/File;Lwn/c;)Ljava/lang/Object;", "Lokhttp3/MultipartBody;", "buildUploadMultipartBody", "(Lio/elevenlabs/domain/model/FileData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody;", "htmlChecksum", "removeCache", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "item", "removeMetaAndChapters", "(Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;Lwn/c;)Ljava/lang/Object;", "setCompletedAtIfNeeded", "setCompleted", "checksum", "getHtmlCacheFile", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "getOfflineHtmlFile", "(Ljava/lang/String;)Ljava/io/File;", "Lio/elevenlabs/domain/services/FileService;", "Lio/elevenlabs/data/api/ReadsUploadAPI;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/data/api/ReadsAPI;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lvr/c;", "Lfr/d0;", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/Configuration;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Landroid/content/Context;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/data/services/ReadMetadataSaver;", "Lio/elevenlabs/data/services/optimized/OptimizedReadCache;", "Lio/elevenlabs/data/services/optimized/OptimizedReadSplitter;", "Lio/elevenlabs/data/services/optimized/ChapterContentMemoryCache;", ParameterNames.TAG, "Ljava/lang/String;", "<set-?>", "lastSyncTimestamp$delegate", "Lko/b;", "getLastSyncTimestamp", "()J", "setLastSyncTimestamp", "(J)V", "lastSyncTimestamp", "lastFlushTimestamp", "J", "ReadsSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsServiceImpl implements ReadsService {
    static final /* synthetic */ u[] $$delegatedProperties = {new q(ReadsServiceImpl.class, "lastSyncTimestamp", "getLastSyncTimestamp()J", 0)};
    private final Analytics analytics;
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final Context appContext;
    private final ChapterContentMemoryCache chapterMemoryCache;
    private final Configuration configuration;
    private final ConnectivityService connectivityService;
    private final d0 coroutineScope;
    private final DispatcherFactory dispatcherFactory;
    private final FileService fileService;
    private final vr.c json;
    private long lastFlushTimestamp;

    /* renamed from: lastSyncTimestamp$delegate, reason: from kotlin metadata */
    private final ko.b lastSyncTimestamp;
    private final Logger logger;
    private final OptimizedReadCache optimizedReadCache;
    private final OptimizedReadSplitter optimizedReadSplitter;
    private final ReadMetadataSaver readMetadataSaver;
    private final ReadsAPI readsAPI;
    private final ReadsDao readsDao;
    private final ReadsUploadAPI readsUploadAPI;
    private final String tag;
    private final SharedPreferences userSharedPreferences;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/ReadsServiceImpl$ReadsSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class ReadsSyncException extends Exception {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadsService.SortBy.values().length];
            try {
                iArr[ReadsService.SortBy.UpdatedAt.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadsService.SortBy.AddedAt.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadsService.SortBy.Progress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReadsServiceImpl(FileService fileService, ReadsUploadAPI readsUploadAPI, ReadsDao readsDao, Logger logger, ReadsAPI readsAPI, DispatcherFactory dispatcherFactory, vr.c cVar, @ApplicationCoroutineScope d0 d0Var, @UserSharedPreferences SharedPreferences sharedPreferences, Configuration configuration, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Context context, ConnectivityService connectivityService, Analytics analytics, ReadMetadataSaver readMetadataSaver, OptimizedReadCache optimizedReadCache, OptimizedReadSplitter optimizedReadSplitter, ChapterContentMemoryCache chapterContentMemoryCache) {
        fileService.getClass();
        readsUploadAPI.getClass();
        readsDao.getClass();
        logger.getClass();
        readsAPI.getClass();
        dispatcherFactory.getClass();
        cVar.getClass();
        d0Var.getClass();
        sharedPreferences.getClass();
        configuration.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        context.getClass();
        connectivityService.getClass();
        analytics.getClass();
        readMetadataSaver.getClass();
        optimizedReadCache.getClass();
        optimizedReadSplitter.getClass();
        chapterContentMemoryCache.getClass();
        this.fileService = fileService;
        this.readsUploadAPI = readsUploadAPI;
        this.readsDao = readsDao;
        this.logger = logger;
        this.readsAPI = readsAPI;
        this.dispatcherFactory = dispatcherFactory;
        this.json = cVar;
        this.coroutineScope = d0Var;
        this.userSharedPreferences = sharedPreferences;
        this.configuration = configuration;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.appContext = context;
        this.connectivityService = connectivityService;
        this.analytics = analytics;
        this.readMetadataSaver = readMetadataSaver;
        this.optimizedReadCache = optimizedReadCache;
        this.optimizedReadSplitter = optimizedReadSplitter;
        this.chapterMemoryCache = chapterContentMemoryCache;
        this.tag = "ReadsService";
        this.lastSyncTimestamp = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "reads_last_sync_timestamp", 0L);
    }

    public static /* synthetic */ z a(ReadsServiceImpl readsServiceImpl, String str, String str2, ChapterContentBlob chapterContentBlob) {
        return splitAndCacheIfNeeded$lambda$0$0(readsServiceImpl, str, str2, chapterContentBlob);
    }

    public static final AddPodcastResult addPodcast$lambda$1(ReadMetadataResponseModel readMetadataResponseModel) {
        readMetadataResponseModel.getClass();
        return new AddPodcastResult.Success(ReadMappingKt.toDomain(readMetadataResponseModel));
    }

    public static final ReadMeta addSharedRead$lambda$0(ReadMetadataResponseModel readMetadataResponseModel) {
        readMetadataResponseModel.getClass();
        return ReadMappingKt.toDomain(readMetadataResponseModel);
    }

    public static final ReadMeta addUpload$lambda$0(ReadMetadataResponseModel readMetadataResponseModel) {
        readMetadataResponseModel.getClass();
        return ReadMappingKt.toDomain(readMetadataResponseModel);
    }

    private final MultipartBody buildUploadMultipartBody(FileData file, String source, String title, String sourceUrl) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.b(MultipartBody.f25328f);
        MultipartBody.Part b10 = MultipartBody.Part.Companion.b("from_document", file.getFileName(), new FileDataRequestBody(file));
        ArrayList arrayList = builder.f25338c;
        arrayList.add(b10);
        builder.a("source", source);
        if (title != null && !n.m0(title)) {
            builder.a("title", title);
        }
        if (sourceUrl != null && !n.m0(sourceUrl)) {
            builder.a("source_url", sourceUrl);
        }
        if (!arrayList.isEmpty()) {
            return new MultipartBody(builder.f25336a, builder.f25337b, _UtilJvmKt.j(arrayList));
        }
        c6.x("Multipart body must have at least one part.");
        return null;
    }

    public final File getHtmlCacheFile(String id2, String checksum) {
        String str;
        if (checksum != null && !n.m0(checksum)) {
            str = defpackage.f.i("-", checksum);
        } else {
            str = "";
        }
        return new File(this.fileService.getCacheDirectory(), defpackage.f.k("html/", id2, str, "-s.html"));
    }

    public final long getLastSyncTimestamp() {
        return ((Number) this.lastSyncTimestamp.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final File getOfflineHtmlFile(String readId) {
        return new File(new File(this.appContext.getFilesDir(), defpackage.f.i("audiodata-v1/", readId)), OfflineReadsDownloader.DOWNLOAD_HTML_CONTENT_FILENAME);
    }

    public static final MakePodcastResult makePodcast$lambda$1(ReadMetadataResponseModel readMetadataResponseModel) {
        readMetadataResponseModel.getClass();
        return new MakePodcastResult.Success(readMetadataResponseModel.getReadId());
    }

    public static final z rateRead$lambda$0(RateReadResponseModel rateReadResponseModel) {
        rateReadResponseModel.getClass();
        return z.f31622a;
    }

    public static final ReadMeta refreshRead$lambda$0(ReadMetadataResponseModel readMetadataResponseModel) {
        readMetadataResponseModel.getClass();
        return ReadMappingKt.toDomain(readMetadataResponseModel);
    }

    public final Object removeCache(String str, String str2, wn.c<? super z> cVar) {
        this.chapterMemoryCache.clearForRead(str);
        Object Q = g0.Q(this.dispatcherFactory.getIo(), new ReadsServiceImpl$removeCache$2(this, str, str2, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r8.deleteSampleConfig(r7, r0) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r8.deleteChapters(r1, r0) != r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r8.deleteRead(r1, r0) == r5) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeMetaAndChapters(ReadMetaEntityWithChapters readMetaEntityWithChapters, wn.c<? super z> cVar) {
        ReadsServiceImpl$removeMetaAndChapters$1 readsServiceImpl$removeMetaAndChapters$1;
        int i10;
        if (cVar instanceof ReadsServiceImpl$removeMetaAndChapters$1) {
            readsServiceImpl$removeMetaAndChapters$1 = (ReadsServiceImpl$removeMetaAndChapters$1) cVar;
            int i11 = readsServiceImpl$removeMetaAndChapters$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$removeMetaAndChapters$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$removeMetaAndChapters$1.result;
                i10 = readsServiceImpl$removeMetaAndChapters$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return z.f31622a;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) readsServiceImpl$removeMetaAndChapters$1.L$0;
                        sn.a.g(obj);
                        SampleConfigEntity sampleConfig = readMetaEntityWithChapters.getSampleConfig();
                        if (sampleConfig != null) {
                            ReadsDao readsDao = this.readsDao;
                            readsServiceImpl$removeMetaAndChapters$1.L$0 = null;
                            readsServiceImpl$removeMetaAndChapters$1.L$1 = null;
                            readsServiceImpl$removeMetaAndChapters$1.I$0 = 0;
                            readsServiceImpl$removeMetaAndChapters$1.label = 3;
                        }
                        return z.f31622a;
                    }
                    readMetaEntityWithChapters = (ReadMetaEntityWithChapters) readsServiceImpl$removeMetaAndChapters$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsDao readsDao2 = this.readsDao;
                    ReadMetaEntity meta = readMetaEntityWithChapters.getMeta();
                    readsServiceImpl$removeMetaAndChapters$1.L$0 = readMetaEntityWithChapters;
                    readsServiceImpl$removeMetaAndChapters$1.label = 1;
                }
                ReadsDao readsDao3 = this.readsDao;
                List<ReadChapterEntity> chapters = readMetaEntityWithChapters.getChapters();
                readsServiceImpl$removeMetaAndChapters$1.L$0 = readMetaEntityWithChapters;
                readsServiceImpl$removeMetaAndChapters$1.label = 2;
            }
        }
        readsServiceImpl$removeMetaAndChapters$1 = new ReadsServiceImpl$removeMetaAndChapters$1(this, cVar);
        Object obj2 = readsServiceImpl$removeMetaAndChapters$1.result;
        i10 = readsServiceImpl$removeMetaAndChapters$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        ReadsDao readsDao32 = this.readsDao;
        List<ReadChapterEntity> chapters2 = readMetaEntityWithChapters.getChapters();
        readsServiceImpl$removeMetaAndChapters$1.L$0 = readMetaEntityWithChapters;
        readsServiceImpl$removeMetaAndChapters$1.label = 2;
    }

    public final Object setCompleted(String str, wn.c<? super z> cVar) {
        this.readsDao.updateCompletedAtUnix(new ReadsDao.ReadMetaCompletedAtUnixUpdate(str, new Long(System.currentTimeMillis() / SignalClient.CLOSE_REASON_NORMAL_CLOSURE), (SyncState) null, 4, (kotlin.jvm.internal.f) null));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r9 == r5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCompletedAtIfNeeded(String str, wn.c<? super z> cVar) {
        ReadsServiceImpl$setCompletedAtIfNeeded$1 readsServiceImpl$setCompletedAtIfNeeded$1;
        int i10;
        Object obj;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        ReadMeta readMeta;
        if (cVar instanceof ReadsServiceImpl$setCompletedAtIfNeeded$1) {
            readsServiceImpl$setCompletedAtIfNeeded$1 = (ReadsServiceImpl$setCompletedAtIfNeeded$1) cVar;
            int i11 = readsServiceImpl$setCompletedAtIfNeeded$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$setCompletedAtIfNeeded$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = readsServiceImpl$setCompletedAtIfNeeded$1.result;
                i10 = readsServiceImpl$setCompletedAtIfNeeded$1.label;
                z zVar = z.f31622a;
                obj = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj2);
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) readsServiceImpl$setCompletedAtIfNeeded$1.L$0;
                    sn.a.g(obj2);
                } else {
                    sn.a.g(obj2);
                    ReadsDao readsDao = this.readsDao;
                    readsServiceImpl$setCompletedAtIfNeeded$1.L$0 = str;
                    readsServiceImpl$setCompletedAtIfNeeded$1.label = 1;
                    obj2 = readsDao.getById(str, readsServiceImpl$setCompletedAtIfNeeded$1);
                }
                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj2;
                if (readMetaEntityWithChapters == null) {
                    readMeta = ReadMappingKt.toDomain(readMetaEntityWithChapters);
                } else {
                    readMeta = null;
                }
                if (readMeta != null && ReadMetaKt.isAtEnd(readMeta) && readMeta.getCompletedAt() == null) {
                    readsServiceImpl$setCompletedAtIfNeeded$1.L$0 = null;
                    readsServiceImpl$setCompletedAtIfNeeded$1.L$1 = null;
                    readsServiceImpl$setCompletedAtIfNeeded$1.label = 2;
                    if (setCompleted(str, readsServiceImpl$setCompletedAtIfNeeded$1) != obj) {
                        return obj;
                    }
                }
                return zVar;
            }
        }
        readsServiceImpl$setCompletedAtIfNeeded$1 = new ReadsServiceImpl$setCompletedAtIfNeeded$1(this, cVar);
        Object obj22 = readsServiceImpl$setCompletedAtIfNeeded$1.result;
        i10 = readsServiceImpl$setCompletedAtIfNeeded$1.label;
        z zVar2 = z.f31622a;
        obj = xn.a.f37986a;
        if (i10 == 0) {
        }
        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj22;
        if (readMetaEntityWithChapters == null) {
        }
        if (readMeta != null) {
            readsServiceImpl$setCompletedAtIfNeeded$1.L$0 = null;
            readsServiceImpl$setCompletedAtIfNeeded$1.L$1 = null;
            readsServiceImpl$setCompletedAtIfNeeded$1.label = 2;
            if (setCompleted(str, readsServiceImpl$setCompletedAtIfNeeded$1) != obj) {
            }
        }
        return zVar2;
    }

    public final void setLastSyncTimestamp(long j4) {
        this.lastSyncTimestamp.setValue(this, $$delegatedProperties[0], Long.valueOf(j4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object splitAndCacheIfNeeded(String str, File file, wn.c<? super z> cVar) {
        ReadsServiceImpl$splitAndCacheIfNeeded$1 readsServiceImpl$splitAndCacheIfNeeded$1;
        int i10;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        if (cVar instanceof ReadsServiceImpl$splitAndCacheIfNeeded$1) {
            readsServiceImpl$splitAndCacheIfNeeded$1 = (ReadsServiceImpl$splitAndCacheIfNeeded$1) cVar;
            int i11 = readsServiceImpl$splitAndCacheIfNeeded$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$splitAndCacheIfNeeded$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$splitAndCacheIfNeeded$1.result;
                i10 = readsServiceImpl$splitAndCacheIfNeeded$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        file = (File) readsServiceImpl$splitAndCacheIfNeeded$1.L$1;
                        str = (String) readsServiceImpl$splitAndCacheIfNeeded$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReadsDao readsDao = this.readsDao;
                    readsServiceImpl$splitAndCacheIfNeeded$1.L$0 = str;
                    readsServiceImpl$splitAndCacheIfNeeded$1.L$1 = file;
                    readsServiceImpl$splitAndCacheIfNeeded$1.label = 1;
                    obj = readsDao.getById(str, readsServiceImpl$splitAndCacheIfNeeded$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                z zVar = z.f31622a;
                if (readMetaEntityWithChapters != null) {
                    String html_checksum = readMetaEntityWithChapters.getMeta().getHtml_checksum();
                    if (this.optimizedReadCache.readIndex(str, html_checksum) == null) {
                        List<Chapter> chapters = ReadMappingKt.toDomain(readMetaEntityWithChapters).getChapters();
                        if (!chapters.isEmpty()) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), wq.b.f37231a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            try {
                                OptimizedReadIndexBlob splitStreaming = this.optimizedReadSplitter.splitStreaming(new vq.a(new m(bufferedReader, 0)), chapters, new o0(this, str, html_checksum, 8));
                                bufferedReader.close();
                                this.optimizedReadCache.writeIndex(str, html_checksum, splitStreaming);
                                return zVar;
                            } finally {
                            }
                        }
                    }
                }
                return zVar;
            }
        }
        readsServiceImpl$splitAndCacheIfNeeded$1 = new ReadsServiceImpl$splitAndCacheIfNeeded$1(this, cVar);
        Object obj2 = readsServiceImpl$splitAndCacheIfNeeded$1.result;
        i10 = readsServiceImpl$splitAndCacheIfNeeded$1.label;
        if (i10 == 0) {
        }
        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj2;
        z zVar2 = z.f31622a;
        if (readMetaEntityWithChapters != null) {
        }
        return zVar2;
    }

    public static final z splitAndCacheIfNeeded$lambda$0$0(ReadsServiceImpl readsServiceImpl, String str, String str2, ChapterContentBlob chapterContentBlob) {
        chapterContentBlob.getClass();
        readsServiceImpl.optimizedReadCache.writeChapter(str, str2, chapterContentBlob);
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r10 == r6) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addExploreRead(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        ReadsServiceImpl$addExploreRead$1 readsServiceImpl$addExploreRead$1;
        int i10;
        AsyncCallResult domain;
        AsyncCallResult asyncCallResult;
        AsyncCallResult domain2;
        if (cVar instanceof ReadsServiceImpl$addExploreRead$1) {
            readsServiceImpl$addExploreRead$1 = (ReadsServiceImpl$addExploreRead$1) cVar;
            int i11 = readsServiceImpl$addExploreRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$addExploreRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$addExploreRead$1.result;
                i10 = readsServiceImpl$addExploreRead$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                AsyncCallResult asyncCallResult2 = (AsyncCallResult) readsServiceImpl$addExploreRead$1.L$1;
                                sn.a.g(obj);
                                return asyncCallResult2;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        asyncCallResult = (AsyncCallResult) readsServiceImpl$addExploreRead$1.L$1;
                        sn.a.g(obj);
                        domain2 = ApiResultExtensionKt.toDomain((ApiResult) obj);
                        if (domain2 instanceof AsyncCallResult.Success) {
                            ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                            ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity((ReadMetadataResponseModel) ((AsyncCallResult.Success) domain2).getData());
                            readsServiceImpl$addExploreRead$1.L$0 = null;
                            readsServiceImpl$addExploreRead$1.L$1 = asyncCallResult;
                            readsServiceImpl$addExploreRead$1.L$2 = null;
                            readsServiceImpl$addExploreRead$1.label = 3;
                            if (readMetadataSaver.saveMetaAndChapters(entity, readsServiceImpl$addExploreRead$1) == aVar) {
                                return aVar;
                            }
                        }
                        return asyncCallResult;
                    }
                    str = (String) readsServiceImpl$addExploreRead$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsAPI readsAPI = this.readsAPI;
                    readsServiceImpl$addExploreRead$1.L$0 = str;
                    readsServiceImpl$addExploreRead$1.label = 1;
                    obj = readsAPI.addExploreRead(str, readsServiceImpl$addExploreRead$1);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    return domain;
                }
                ReadsAPI readsAPI2 = this.readsAPI;
                readsServiceImpl$addExploreRead$1.L$0 = null;
                readsServiceImpl$addExploreRead$1.L$1 = domain;
                readsServiceImpl$addExploreRead$1.label = 2;
                Object read = readsAPI2.getRead(str, "no-cache", readsServiceImpl$addExploreRead$1);
                if (read != aVar) {
                    obj = read;
                    asyncCallResult = domain;
                    domain2 = ApiResultExtensionKt.toDomain((ApiResult) obj);
                    if (domain2 instanceof AsyncCallResult.Success) {
                    }
                    return asyncCallResult;
                }
                return aVar;
            }
        }
        readsServiceImpl$addExploreRead$1 = new ReadsServiceImpl$addExploreRead$1(this, cVar);
        Object obj2 = readsServiceImpl$addExploreRead$1.result;
        i10 = readsServiceImpl$addExploreRead$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0114, code lost:
    
        if (r9.saveMetaAndChapters(r8, r0) == r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r11 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addPodcast(FileData fileData, String str, String str2, String str3, wn.c<? super AsyncCallResult<AddPodcastResult>> cVar) {
        ReadsServiceImpl$addPodcast$1 readsServiceImpl$addPodcast$1;
        int i10;
        Boolean bool;
        ApiResult apiResult;
        AsyncCallResult domain;
        LimitedBasedReadApiErrorData limitedBasedReadApiErrorData;
        LimitReachedData domain2;
        if (cVar instanceof ReadsServiceImpl$addPodcast$1) {
            readsServiceImpl$addPodcast$1 = (ReadsServiceImpl$addPodcast$1) cVar;
            int i11 = readsServiceImpl$addPodcast$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$addPodcast$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$addPodcast$1.result;
                i10 = readsServiceImpl$addPodcast$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            domain = (AsyncCallResult) readsServiceImpl$addPodcast$1.L$5;
                            sn.a.g(obj);
                            return ApiResultExtensionKt.map(domain, new b(23));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsUploadAPI readsUploadAPI = this.readsUploadAPI;
                    MultipartBody buildUploadMultipartBody = buildUploadMultipartBody(fileData, str, str2, str3);
                    if (this.configuration.getUseMockedPodcasts()) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = null;
                    }
                    readsServiceImpl$addPodcast$1.L$0 = null;
                    readsServiceImpl$addPodcast$1.L$1 = null;
                    readsServiceImpl$addPodcast$1.L$2 = null;
                    readsServiceImpl$addPodcast$1.L$3 = null;
                    readsServiceImpl$addPodcast$1.label = 1;
                    obj = readsUploadAPI.addPodcast(buildUploadMultipartBody, bool, readsServiceImpl$addPodcast$1);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Error.ApiError) {
                    ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) apiResult;
                    if (kotlin.jvm.internal.m.c(apiError.getCode(), "too_many_podcasts")) {
                        kotlinx.serialization.json.b data = apiError.getData();
                        if (data != null) {
                            vr.c cVar2 = this.json;
                            cVar2.getClass();
                            limitedBasedReadApiErrorData = (LimitedBasedReadApiErrorData) cVar2.a(LimitedBasedReadApiErrorData.INSTANCE.serializer(), data);
                        } else {
                            limitedBasedReadApiErrorData = null;
                        }
                        if (limitedBasedReadApiErrorData != null) {
                            this.logger.log(this.tag, "addPodcast() failed due to limits - response=" + apiResult);
                            domain2 = ReadsServiceImplKt.toDomain(limitedBasedReadApiErrorData, apiError.getMessage());
                            return new AsyncCallResult.Success(new AddPodcastResult.LimitReached(domain2));
                        }
                    }
                }
                domain = ApiResultExtensionKt.toDomain(apiResult);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    if (domain instanceof AsyncCallResult.Success) {
                        ReadMetadataResponseModel readMetadataResponseModel = (ReadMetadataResponseModel) ((AsyncCallResult.Success) domain).getData();
                        ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                        ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity(readMetadataResponseModel);
                        readsServiceImpl$addPodcast$1.L$0 = null;
                        readsServiceImpl$addPodcast$1.L$1 = null;
                        readsServiceImpl$addPodcast$1.L$2 = null;
                        readsServiceImpl$addPodcast$1.L$3 = null;
                        readsServiceImpl$addPodcast$1.L$4 = null;
                        readsServiceImpl$addPodcast$1.L$5 = domain;
                        readsServiceImpl$addPodcast$1.L$6 = null;
                        readsServiceImpl$addPodcast$1.label = 2;
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(domain, new b(23));
            }
        }
        readsServiceImpl$addPodcast$1 = new ReadsServiceImpl$addPodcast$1(this, cVar);
        Object obj2 = readsServiceImpl$addPodcast$1.result;
        i10 = readsServiceImpl$addPodcast$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Error.ApiError) {
        }
        domain = ApiResultExtensionKt.toDomain(apiResult);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
        return ApiResultExtensionKt.map(domain, new b(23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r8.saveMetaAndChapters(r9, r0) == r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r9 == r5) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addSharedRead(String str, String str2, wn.c<? super AsyncCallResult<ReadMeta>> cVar) {
        ReadsServiceImpl$addSharedRead$1 readsServiceImpl$addSharedRead$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof ReadsServiceImpl$addSharedRead$1) {
            readsServiceImpl$addSharedRead$1 = (ReadsServiceImpl$addSharedRead$1) cVar;
            int i11 = readsServiceImpl$addSharedRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$addSharedRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$addSharedRead$1.result;
                i10 = readsServiceImpl$addSharedRead$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            domain = (AsyncCallResult) readsServiceImpl$addSharedRead$1.L$2;
                            sn.a.g(obj);
                            return ApiResultExtensionKt.map(domain, new b(28));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsAPI readsAPI = this.readsAPI;
                    readsServiceImpl$addSharedRead$1.L$0 = null;
                    readsServiceImpl$addSharedRead$1.L$1 = null;
                    readsServiceImpl$addSharedRead$1.label = 1;
                    obj = readsAPI.addSharedRead(str, str2, readsServiceImpl$addSharedRead$1);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    if (domain instanceof AsyncCallResult.Success) {
                        ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                        ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity((ReadMetadataResponseModel) ((AsyncCallResult.Success) domain).getData());
                        readsServiceImpl$addSharedRead$1.L$0 = null;
                        readsServiceImpl$addSharedRead$1.L$1 = null;
                        readsServiceImpl$addSharedRead$1.L$2 = domain;
                        readsServiceImpl$addSharedRead$1.label = 2;
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(domain, new b(28));
            }
        }
        readsServiceImpl$addSharedRead$1 = new ReadsServiceImpl$addSharedRead$1(this, cVar);
        Object obj2 = readsServiceImpl$addSharedRead$1.result;
        i10 = readsServiceImpl$addSharedRead$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
        return ApiResultExtensionKt.map(domain, new b(28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r9.saveMetaAndChapters(r8, r0) == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r11 == r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addUpload(FileData fileData, String str, String str2, String str3, wn.c<? super AsyncCallResult<ReadMeta>> cVar) {
        ReadsServiceImpl$addUpload$1 readsServiceImpl$addUpload$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof ReadsServiceImpl$addUpload$1) {
            readsServiceImpl$addUpload$1 = (ReadsServiceImpl$addUpload$1) cVar;
            int i11 = readsServiceImpl$addUpload$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$addUpload$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$addUpload$1.result;
                i10 = readsServiceImpl$addUpload$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            domain = (AsyncCallResult) readsServiceImpl$addUpload$1.L$4;
                            sn.a.g(obj);
                            return ApiResultExtensionKt.map(domain, new b(24));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsUploadAPI readsUploadAPI = this.readsUploadAPI;
                    MultipartBody buildUploadMultipartBody = buildUploadMultipartBody(fileData, str, str2, str3);
                    readsServiceImpl$addUpload$1.L$0 = null;
                    readsServiceImpl$addUpload$1.L$1 = null;
                    readsServiceImpl$addUpload$1.L$2 = null;
                    readsServiceImpl$addUpload$1.L$3 = null;
                    readsServiceImpl$addUpload$1.label = 1;
                    obj = readsUploadAPI.addRead(buildUploadMultipartBody, readsServiceImpl$addUpload$1);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    if (domain instanceof AsyncCallResult.Success) {
                        ReadMetadataResponseModel readMetadataResponseModel = (ReadMetadataResponseModel) ((AsyncCallResult.Success) domain).getData();
                        ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                        ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity(readMetadataResponseModel);
                        readsServiceImpl$addUpload$1.L$0 = null;
                        readsServiceImpl$addUpload$1.L$1 = null;
                        readsServiceImpl$addUpload$1.L$2 = null;
                        readsServiceImpl$addUpload$1.L$3 = null;
                        readsServiceImpl$addUpload$1.L$4 = domain;
                        readsServiceImpl$addUpload$1.L$5 = null;
                        readsServiceImpl$addUpload$1.label = 2;
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(domain, new b(24));
            }
        }
        readsServiceImpl$addUpload$1 = new ReadsServiceImpl$addUpload$1(this, cVar);
        Object obj2 = readsServiceImpl$addUpload$1.result;
        i10 = readsServiceImpl$addUpload$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
        return ApiResultExtensionKt.map(domain, new b(24));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object archive(String str, wn.c<? super z> cVar) {
        ReadsServiceImpl$archive$1 readsServiceImpl$archive$1;
        int i10;
        if (cVar instanceof ReadsServiceImpl$archive$1) {
            readsServiceImpl$archive$1 = (ReadsServiceImpl$archive$1) cVar;
            int i11 = readsServiceImpl$archive$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$archive$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$archive$1.result;
                i10 = readsServiceImpl$archive$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.readsDao.updateArchivedStatus(new ReadsDao.ReadMetaArchiveUpdate(str, true));
                    ReadsAPI readsAPI = this.readsAPI;
                    readsServiceImpl$archive$1.L$0 = null;
                    readsServiceImpl$archive$1.label = 1;
                    obj = readsAPI.archiveRead(str, readsServiceImpl$archive$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                ApiResultExtensionKt.toDomain((ApiResult) obj);
                return z.f31622a;
            }
        }
        readsServiceImpl$archive$1 = new ReadsServiceImpl$archive$1(this, cVar);
        Object obj2 = readsServiceImpl$archive$1.result;
        i10 = readsServiceImpl$archive$1.label;
        if (i10 == 0) {
        }
        ApiResultExtensionKt.toDomain((ApiResult) obj2);
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object filterReadsInLibrary(List<String> list, wn.c<? super List<String>> cVar) {
        List<ReadMetaEntityWithChapters> allById = this.readsDao.getAllById(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : allById) {
            if (((ReadMetaEntityWithChapters) obj).getMeta().getIn_user_library()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ReadMetaEntityWithChapters) it.next()).getMeta().getRead_id());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0141 -> B:11:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0145 -> B:12:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flushListeningPositions(wn.c<? super z> cVar) {
        ReadsServiceImpl$flushListeningPositions$1 readsServiceImpl$flushListeningPositions$1;
        int i10;
        Iterator it;
        int i11;
        Iterator it2;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        int i12;
        if (cVar instanceof ReadsServiceImpl$flushListeningPositions$1) {
            readsServiceImpl$flushListeningPositions$1 = (ReadsServiceImpl$flushListeningPositions$1) cVar;
            int i13 = readsServiceImpl$flushListeningPositions$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$flushListeningPositions$1.label = i13 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$flushListeningPositions$1.result;
                i10 = readsServiceImpl$flushListeningPositions$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = readsServiceImpl$flushListeningPositions$1.I$0;
                            Iterator it3 = (Iterator) readsServiceImpl$flushListeningPositions$1.L$2;
                            sn.a.g(obj);
                            it = it3;
                            if (!it.hasNext()) {
                                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) it.next();
                                ReadsAPI readsAPI = this.readsAPI;
                                String read_id = readMetaEntityWithChapters.getMeta().getRead_id();
                                ReadUpdateModel readUpdateModel = new ReadUpdateModel(readMetaEntityWithChapters.getMeta().getLast_listened_char_offset(), readMetaEntityWithChapters.getMeta().getTitle(), readMetaEntityWithChapters.getMeta().getAuthor(), readMetaEntityWithChapters.getMeta().getDescription(), Boolean.valueOf(readMetaEntityWithChapters.getMeta().getMarked_as_unread()), readMetaEntityWithChapters.getMeta().getCompleted_at_unix(), readMetaEntityWithChapters.getMeta().getLast_listened_audio_file_number(), readMetaEntityWithChapters.getMeta().getLast_listened_audio_seconds());
                                readsServiceImpl$flushListeningPositions$1.L$0 = null;
                                readsServiceImpl$flushListeningPositions$1.L$1 = null;
                                readsServiceImpl$flushListeningPositions$1.L$2 = it;
                                readsServiceImpl$flushListeningPositions$1.L$3 = null;
                                readsServiceImpl$flushListeningPositions$1.L$4 = readMetaEntityWithChapters;
                                readsServiceImpl$flushListeningPositions$1.L$5 = null;
                                readsServiceImpl$flushListeningPositions$1.I$0 = i11;
                                readsServiceImpl$flushListeningPositions$1.I$1 = 0;
                                readsServiceImpl$flushListeningPositions$1.label = 1;
                                Object updateRead = readsAPI.updateRead(read_id, readUpdateModel, readsServiceImpl$flushListeningPositions$1);
                                if (updateRead != aVar) {
                                    it2 = it;
                                    obj = updateRead;
                                    i12 = 0;
                                    if (!(((ApiResult) obj) instanceof ApiResult.Success)) {
                                        ReadsDao readsDao = this.readsDao;
                                        ReadsDao.ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate = new ReadsDao.ReadMetaSyncStatusUpdate(readMetaEntityWithChapters.getMeta().getRead_id(), SyncState.UPDATED);
                                        readsServiceImpl$flushListeningPositions$1.L$0 = null;
                                        readsServiceImpl$flushListeningPositions$1.L$1 = null;
                                        readsServiceImpl$flushListeningPositions$1.L$2 = it2;
                                        readsServiceImpl$flushListeningPositions$1.L$3 = null;
                                        readsServiceImpl$flushListeningPositions$1.L$4 = null;
                                        readsServiceImpl$flushListeningPositions$1.L$5 = null;
                                        readsServiceImpl$flushListeningPositions$1.I$0 = i11;
                                        readsServiceImpl$flushListeningPositions$1.I$1 = i12;
                                        readsServiceImpl$flushListeningPositions$1.label = 2;
                                        if (readsDao.updateStatus(readMetaSyncStatusUpdate, readsServiceImpl$flushListeningPositions$1) != aVar) {
                                            it3 = it2;
                                            it = it3;
                                            if (!it.hasNext()) {
                                                return z.f31622a;
                                            }
                                        }
                                    } else {
                                        this.logger.log(this.tag, "Can't update the read");
                                        it = it2;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                                return aVar;
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        int i14 = readsServiceImpl$flushListeningPositions$1.I$1;
                        int i15 = readsServiceImpl$flushListeningPositions$1.I$0;
                        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) readsServiceImpl$flushListeningPositions$1.L$4;
                        it2 = (Iterator) readsServiceImpl$flushListeningPositions$1.L$2;
                        sn.a.g(obj);
                        i12 = i14;
                        i11 = i15;
                        if (!(((ApiResult) obj) instanceof ApiResult.Success)) {
                        }
                    }
                } else {
                    sn.a.g(obj);
                    List<ReadMetaEntityWithChapters> allWithSyncState = this.readsDao.getAllWithSyncState(SyncState.PENDING_UPDATE_PUSH);
                    this.logger.log(this.tag, "Items to update: " + allWithSyncState.size());
                    it = allWithSyncState.iterator();
                    i11 = 0;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        readsServiceImpl$flushListeningPositions$1 = new ReadsServiceImpl$flushListeningPositions$1(this, cVar);
        Object obj2 = readsServiceImpl$flushListeningPositions$1.result;
        i10 = readsServiceImpl$flushListeningPositions$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object getRead(String str, wn.c<? super ReadMeta> cVar) {
        return g0.Q(this.dispatcherFactory.getDefault(), new ReadsServiceImpl$getRead$2(this, str, null), cVar);
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object getReadDetails(String str, wn.c<? super ir.i> cVar) {
        final m1 m1Var = new m1(new ReadsServiceImpl$getReadDetails$2(this, str, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$getReadDetails$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$getReadDetails$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$getReadDetails$$inlined$map$1$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$getReadDetails$$inlined$map$1$2$1, reason: invalid class name */
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
                                AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), ReadsServiceImpl$getReadDetails$3$1.INSTANCE);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(map, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object getReadDetailsSections(String str, wn.c<? super ir.i> cVar) {
        this.logger.log(this.tag, "getReadDetailsSections - readId=" + str);
        final m1 m1Var = new m1(new ReadsServiceImpl$getReadDetailsSections$2(this, str, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$getReadDetailsSections$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$getReadDetailsSections$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$getReadDetailsSections$$inlined$map$1$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$getReadDetailsSections$$inlined$map$1$2$1, reason: invalid class name */
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
                                AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), ReadsServiceImpl$getReadDetailsSections$3$1.INSTANCE);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(map, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getReadHtml(String str, wn.c<? super ir.i> cVar) {
        ReadsServiceImpl$getReadHtml$1 readsServiceImpl$getReadHtml$1;
        int i10;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        String str2;
        ReadMetaEntity meta;
        if (cVar instanceof ReadsServiceImpl$getReadHtml$1) {
            readsServiceImpl$getReadHtml$1 = (ReadsServiceImpl$getReadHtml$1) cVar;
            int i11 = readsServiceImpl$getReadHtml$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$getReadHtml$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$getReadHtml$1.result;
                i10 = readsServiceImpl$getReadHtml$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = (String) readsServiceImpl$getReadHtml$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    File offlineHtmlFile = getOfflineHtmlFile(str);
                    if (offlineHtmlFile.exists() && offlineHtmlFile.isFile() && offlineHtmlFile.length() > 0) {
                        this.logger.log(this.tag, "Using offline HTML file: " + offlineHtmlFile.getAbsolutePath());
                        return new m1(new ReadsServiceImpl$getReadHtml$2(offlineHtmlFile, null));
                    }
                    ReadsDao readsDao = this.readsDao;
                    readsServiceImpl$getReadHtml$1.L$0 = str;
                    readsServiceImpl$getReadHtml$1.L$1 = null;
                    readsServiceImpl$getReadHtml$1.label = 1;
                    obj = readsDao.getById(str, readsServiceImpl$getReadHtml$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                if (readMetaEntityWithChapters == null && (meta = readMetaEntityWithChapters.getMeta()) != null) {
                    str2 = meta.getHtml_checksum();
                } else {
                    str2 = null;
                }
                ib.i.r("Html checksum: ", str2, this.logger, this.tag);
                return FileDownloadExtensionKt.downloadFile(getHtmlCacheFile(str, str2), this.json, new ReadsServiceImpl$getReadHtml$3(this, str, null));
            }
        }
        readsServiceImpl$getReadHtml$1 = new ReadsServiceImpl$getReadHtml$1(this, cVar);
        Object obj2 = readsServiceImpl$getReadHtml$1.result;
        i10 = readsServiceImpl$getReadHtml$1.label;
        if (i10 == 0) {
        }
        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj2;
        if (readMetaEntityWithChapters == null) {
        }
        str2 = null;
        ib.i.r("Html checksum: ", str2, this.logger, this.tag);
        return FileDownloadExtensionKt.downloadFile(getHtmlCacheFile(str, str2), this.json, new ReadsServiceImpl$getReadHtml$3(this, str, null));
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object getReads(int i10, Boolean bool, ReadsService.SortBy sortBy, wn.c<? super ir.i> cVar) {
        String str;
        ReadsDao readsDao = this.readsDao;
        int i11 = WhenMappings.$EnumSwitchMapping$0[sortBy.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    str = "progress";
                } else {
                    c6.p();
                    return null;
                }
            } else {
                str = "added_at_unix";
            }
        } else {
            str = "updated_at_unix";
        }
        final ir.i all$default = ReadsDao.getAll$default(readsDao, i10, str, bool, null, 8, null);
        return new w(new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$getReads$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$getReads$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$getReads$$inlined$map$1$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$getReads$$inlined$map$1$2$1, reason: invalid class name */
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
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(ReadMappingKt.toDomain((ReadMetaEntityWithChapters) it.next()));
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }, new ReadsServiceImpl$getReads$3(this, null), 5);
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object isReadInLibrary(String str, wn.c<? super ir.i> cVar) {
        final ir.i observeById = this.readsDao.observeById(str);
        return r.o(new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$isReadInLibrary$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$isReadInLibrary$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$isReadInLibrary$$inlined$map$1$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$isReadInLibrary$$inlined$map$1$2$1, reason: invalid class name */
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
                    boolean z6;
                    ReadMetaEntity meta;
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
                                ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                                if (readMetaEntityWithChapters != null && (meta = readMetaEntityWithChapters.getMeta()) != null && meta.getIn_user_library()) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        });
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object loadAllChapterContent(String str, wn.c<? super ir.i> cVar) {
        return r.x(new m1(new ReadsServiceImpl$loadAllChapterContent$2(this, str, null)), this.dispatcherFactory.getIo());
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object loadChapterContent(String str, int i10, wn.c<? super ChapterContent> cVar) {
        ChapterContent chapterContent = this.chapterMemoryCache.get(str, i10);
        if (chapterContent != null) {
            return chapterContent;
        }
        return g0.Q(this.dispatcherFactory.getIo(), new ReadsServiceImpl$loadChapterContent$3(this, str, i10, null), cVar);
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object loadOptimizedReadIndex(String str, wn.c<? super List<ChapterSlotIndex>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new ReadsServiceImpl$loadOptimizedReadIndex$2(this, str, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        if (r9.saveMetaAndChapters(r1, r0) == r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        if (r9 == r5) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object makePodcast(String str, wn.c<? super AsyncCallResult<MakePodcastResult>> cVar) {
        ReadsServiceImpl$makePodcast$1 readsServiceImpl$makePodcast$1;
        int i10;
        Boolean bool;
        ApiResult apiResult;
        AsyncCallResult domain;
        LimitedBasedReadApiErrorData limitedBasedReadApiErrorData;
        LimitReachedData domain2;
        if (cVar instanceof ReadsServiceImpl$makePodcast$1) {
            readsServiceImpl$makePodcast$1 = (ReadsServiceImpl$makePodcast$1) cVar;
            int i11 = readsServiceImpl$makePodcast$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$makePodcast$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$makePodcast$1.result;
                i10 = readsServiceImpl$makePodcast$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            domain = (AsyncCallResult) readsServiceImpl$makePodcast$1.L$2;
                            sn.a.g(obj);
                            return ApiResultExtensionKt.map(domain, new b(27));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsUploadAPI readsUploadAPI = this.readsUploadAPI;
                    if (this.configuration.getUseMockedPodcasts()) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = null;
                    }
                    readsServiceImpl$makePodcast$1.L$0 = null;
                    readsServiceImpl$makePodcast$1.label = 1;
                    obj = readsUploadAPI.makePodcast(str, bool, readsServiceImpl$makePodcast$1);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Error.ApiError) {
                    ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) apiResult;
                    if (kotlin.jvm.internal.m.c(apiError.getCode(), "too_many_podcasts")) {
                        kotlinx.serialization.json.b data = apiError.getData();
                        if (data != null) {
                            vr.c cVar2 = this.json;
                            cVar2.getClass();
                            limitedBasedReadApiErrorData = (LimitedBasedReadApiErrorData) cVar2.a(LimitedBasedReadApiErrorData.INSTANCE.serializer(), data);
                        } else {
                            limitedBasedReadApiErrorData = null;
                        }
                        if (limitedBasedReadApiErrorData != null) {
                            this.logger.log(this.tag, "makePodcast() failed due to limits - response=" + apiResult);
                            domain2 = ReadsServiceImplKt.toDomain(limitedBasedReadApiErrorData, apiError.getMessage());
                            return new AsyncCallResult.Success(new MakePodcastResult.LimitReached(domain2));
                        }
                    }
                }
                domain = ApiResultExtensionKt.toDomain(apiResult);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    if (domain instanceof AsyncCallResult.Success) {
                        ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                        ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity((ReadMetadataResponseModel) ((AsyncCallResult.Success) domain).getData());
                        readsServiceImpl$makePodcast$1.L$0 = null;
                        readsServiceImpl$makePodcast$1.L$1 = null;
                        readsServiceImpl$makePodcast$1.L$2 = domain;
                        readsServiceImpl$makePodcast$1.label = 2;
                    } else {
                        c6.p();
                        return null;
                    }
                }
                return ApiResultExtensionKt.map(domain, new b(27));
            }
        }
        readsServiceImpl$makePodcast$1 = new ReadsServiceImpl$makePodcast$1(this, cVar);
        Object obj2 = readsServiceImpl$makePodcast$1.result;
        i10 = readsServiceImpl$makePodcast$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Error.ApiError) {
        }
        domain = ApiResultExtensionKt.toDomain(apiResult);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
        return ApiResultExtensionKt.map(domain, new b(27));
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object markAsUnread(String str, boolean z6, wn.c<? super z> cVar) {
        this.readsDao.updateMarkedAsUnread(new ReadsDao.ReadMetaMarkedAsUnreadUpdate(str, z6, (SyncState) null, 4, (kotlin.jvm.internal.f) null));
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public ir.i observeRead(String id2) {
        id2.getClass();
        final ir.i observeById = this.readsDao.observeById(id2);
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$observeRead$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$observeRead$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$observeRead$$inlined$map$1$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$observeRead$$inlined$map$1$2$1, reason: invalid class name */
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
                    ReadMeta readMeta;
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
                                ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                                if (readMetaEntityWithChapters != null) {
                                    readMeta = ReadMappingKt.toDomain(readMetaEntityWithChapters);
                                } else {
                                    readMeta = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(readMeta, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object prepareOptimizedRead(String str, wn.c<? super ir.i> cVar) {
        return r.x(new m1(new ReadsServiceImpl$prepareOptimizedRead$2(this, str, null)), this.dispatcherFactory.getIo());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rateRead(String str, long j4, wn.c<? super AsyncCallResult<z>> cVar) {
        ReadsServiceImpl$rateRead$1 readsServiceImpl$rateRead$1;
        int i10;
        AsyncCallResult map;
        if (cVar instanceof ReadsServiceImpl$rateRead$1) {
            readsServiceImpl$rateRead$1 = (ReadsServiceImpl$rateRead$1) cVar;
            int i11 = readsServiceImpl$rateRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$rateRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$rateRead$1.result;
                i10 = readsServiceImpl$rateRead$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j4 = readsServiceImpl$rateRead$1.J$0;
                        str = (String) readsServiceImpl$rateRead$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReadsAPI readsAPI = this.readsAPI;
                    BodyRateAReadReadsReadIdRatePost bodyRateAReadReadsReadIdRatePost = new BodyRateAReadReadsReadIdRatePost(j4);
                    readsServiceImpl$rateRead$1.L$0 = str;
                    readsServiceImpl$rateRead$1.J$0 = j4;
                    readsServiceImpl$rateRead$1.label = 1;
                    obj = readsAPI.rateRead(str, bodyRateAReadReadsReadIdRatePost, readsServiceImpl$rateRead$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(26));
                if (map instanceof AsyncCallResult.Success) {
                    this.readsDao.updateRating(new ReadsDao.ReadMetaRatingUpdate(str, new Long(j4)));
                }
                return map;
            }
        }
        readsServiceImpl$rateRead$1 = new ReadsServiceImpl$rateRead$1(this, cVar);
        Object obj2 = readsServiceImpl$rateRead$1.result;
        i10 = readsServiceImpl$rateRead$1.label;
        if (i10 == 0) {
        }
        map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(26));
        if (map instanceof AsyncCallResult.Success) {
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r9 == r5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object redeemRead(String str, String str2, wn.c<? super AsyncCallResult<z>> cVar) {
        ReadsServiceImpl$redeemRead$1 readsServiceImpl$redeemRead$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof ReadsServiceImpl$redeemRead$1) {
            readsServiceImpl$redeemRead$1 = (ReadsServiceImpl$redeemRead$1) cVar;
            int i11 = readsServiceImpl$redeemRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$redeemRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$redeemRead$1.result;
                i10 = readsServiceImpl$redeemRead$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) readsServiceImpl$redeemRead$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsAPI readsAPI = this.readsAPI;
                    RedeemCodeRequest redeemCodeRequest = new RedeemCodeRequest(str2);
                    readsServiceImpl$redeemRead$1.L$0 = str;
                    readsServiceImpl$redeemRead$1.L$1 = null;
                    readsServiceImpl$redeemRead$1.label = 1;
                    obj = readsAPI.redeemRead(str, redeemCodeRequest, readsServiceImpl$redeemRead$1);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Error)) {
                    return domain;
                }
                readsServiceImpl$redeemRead$1.L$0 = null;
                readsServiceImpl$redeemRead$1.L$1 = null;
                readsServiceImpl$redeemRead$1.L$2 = null;
                readsServiceImpl$redeemRead$1.label = 2;
                Object addExploreRead = addExploreRead(str, readsServiceImpl$redeemRead$1);
                if (addExploreRead == obj2) {
                    return obj2;
                }
                return addExploreRead;
            }
        }
        readsServiceImpl$redeemRead$1 = new ReadsServiceImpl$redeemRead$1(this, cVar);
        Object obj3 = readsServiceImpl$redeemRead$1.result;
        i10 = readsServiceImpl$redeemRead$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj3);
        if (!(domain instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r9.saveMetaAndChapters(r1, r0) != r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r9 == r5) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object refreshRead(String str, boolean z6, wn.c<? super AsyncCallResult<ReadMeta>> cVar) {
        ReadsServiceImpl$refreshRead$1 readsServiceImpl$refreshRead$1;
        int i10;
        AsyncCallResult domain;
        if (cVar instanceof ReadsServiceImpl$refreshRead$1) {
            readsServiceImpl$refreshRead$1 = (ReadsServiceImpl$refreshRead$1) cVar;
            int i11 = readsServiceImpl$refreshRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$refreshRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$refreshRead$1.result;
                i10 = readsServiceImpl$refreshRead$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            domain = (AsyncCallResult) readsServiceImpl$refreshRead$1.L$1;
                            sn.a.g(obj);
                            return ApiResultExtensionKt.map(domain, new b(25));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z6 = readsServiceImpl$refreshRead$1.Z$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsAPI readsAPI = this.readsAPI;
                    readsServiceImpl$refreshRead$1.L$0 = null;
                    readsServiceImpl$refreshRead$1.Z$0 = z6;
                    readsServiceImpl$refreshRead$1.label = 1;
                    obj = readsAPI.getRead(str, "no-cache", readsServiceImpl$refreshRead$1);
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (z6 && (domain instanceof AsyncCallResult.Success)) {
                    ReadMetadataSaver readMetadataSaver = this.readMetadataSaver;
                    ReadMetaEntityWithChapters entity = ReadMappingKt.toEntity((ReadMetadataResponseModel) ((AsyncCallResult.Success) domain).getData());
                    readsServiceImpl$refreshRead$1.L$0 = null;
                    readsServiceImpl$refreshRead$1.L$1 = domain;
                    readsServiceImpl$refreshRead$1.Z$0 = z6;
                    readsServiceImpl$refreshRead$1.label = 2;
                }
                return ApiResultExtensionKt.map(domain, new b(25));
            }
        }
        readsServiceImpl$refreshRead$1 = new ReadsServiceImpl$refreshRead$1(this, cVar);
        Object obj2 = readsServiceImpl$refreshRead$1.result;
        i10 = readsServiceImpl$refreshRead$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (z6) {
            ReadMetadataSaver readMetadataSaver2 = this.readMetadataSaver;
            ReadMetaEntityWithChapters entity2 = ReadMappingKt.toEntity((ReadMetadataResponseModel) ((AsyncCallResult.Success) domain).getData());
            readsServiceImpl$refreshRead$1.L$0 = null;
            readsServiceImpl$refreshRead$1.L$1 = domain;
            readsServiceImpl$refreshRead$1.Z$0 = z6;
            readsServiceImpl$refreshRead$1.label = 2;
        }
        return ApiResultExtensionKt.map(domain, new b(25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ff, code lost:
    
        if (removeMetaAndChapters(r13, r0) == r9) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        if (r14 == r9) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (removeCache(r1, r14, r0) == r9) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        if (r14 == r9) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object remove(String str, wn.c<? super Boolean> cVar) {
        ReadsServiceImpl$remove$1 readsServiceImpl$remove$1;
        int i10;
        Object obj;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        ReadsDao readsDao;
        ReadsDao.ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate;
        String str2;
        ReadMetaEntityWithChapters readMetaEntityWithChapters2;
        ReadMetaEntity meta;
        if (cVar instanceof ReadsServiceImpl$remove$1) {
            readsServiceImpl$remove$1 = (ReadsServiceImpl$remove$1) cVar;
            int i11 = readsServiceImpl$remove$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$remove$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = readsServiceImpl$remove$1.result;
                i10 = readsServiceImpl$remove$1.label;
                boolean z6 = false;
                obj = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        sn.a.g(obj2);
                                        this.analytics.log(Analytics.Event.ReadsDeletedReadItem.INSTANCE);
                                        z6 = true;
                                        return Boolean.valueOf(z6);
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                readMetaEntityWithChapters2 = (ReadMetaEntityWithChapters) readsServiceImpl$remove$1.L$1;
                                sn.a.g(obj2);
                                if (((ApiResult) obj2) instanceof ApiResult.Success) {
                                    if (readMetaEntityWithChapters2 != null) {
                                        readsServiceImpl$remove$1.L$0 = null;
                                        readsServiceImpl$remove$1.L$1 = null;
                                        readsServiceImpl$remove$1.L$2 = null;
                                        readsServiceImpl$remove$1.L$3 = null;
                                        readsServiceImpl$remove$1.I$0 = 0;
                                        readsServiceImpl$remove$1.label = 5;
                                    }
                                    this.analytics.log(Analytics.Event.ReadsDeletedReadItem.INSTANCE);
                                    z6 = true;
                                    return Boolean.valueOf(z6);
                                }
                                this.logger.log(this.tag, "Error deleting read");
                                return Boolean.valueOf(z6);
                            }
                            readMetaEntityWithChapters2 = (ReadMetaEntityWithChapters) readsServiceImpl$remove$1.L$1;
                            str2 = (String) readsServiceImpl$remove$1.L$0;
                            sn.a.g(obj2);
                            ReadsAPI readsAPI = this.readsAPI;
                            readsServiceImpl$remove$1.L$0 = null;
                            readsServiceImpl$remove$1.L$1 = readMetaEntityWithChapters2;
                            readsServiceImpl$remove$1.L$2 = null;
                            readsServiceImpl$remove$1.label = 4;
                            obj2 = readsAPI.removeRead(str2, readsServiceImpl$remove$1);
                        } else {
                            readMetaEntityWithChapters2 = (ReadMetaEntityWithChapters) readsServiceImpl$remove$1.L$1;
                            str2 = (String) readsServiceImpl$remove$1.L$0;
                            sn.a.g(obj2);
                            if (readMetaEntityWithChapters2 != null) {
                                String html_checksum = readMetaEntityWithChapters2.getMeta().getHtml_checksum();
                                readsServiceImpl$remove$1.L$0 = str2;
                                readsServiceImpl$remove$1.L$1 = readMetaEntityWithChapters2;
                                readsServiceImpl$remove$1.L$2 = null;
                                readsServiceImpl$remove$1.I$0 = 0;
                                readsServiceImpl$remove$1.label = 3;
                            }
                            ReadsAPI readsAPI2 = this.readsAPI;
                            readsServiceImpl$remove$1.L$0 = null;
                            readsServiceImpl$remove$1.L$1 = readMetaEntityWithChapters2;
                            readsServiceImpl$remove$1.L$2 = null;
                            readsServiceImpl$remove$1.label = 4;
                            obj2 = readsAPI2.removeRead(str2, readsServiceImpl$remove$1);
                        }
                    } else {
                        str = (String) readsServiceImpl$remove$1.L$0;
                        sn.a.g(obj2);
                    }
                } else {
                    sn.a.g(obj2);
                    ReadsDao readsDao2 = this.readsDao;
                    readsServiceImpl$remove$1.L$0 = str;
                    readsServiceImpl$remove$1.label = 1;
                    obj2 = readsDao2.getById(str, readsServiceImpl$remove$1);
                }
                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj2;
                if (readMetaEntityWithChapters == null && (meta = readMetaEntityWithChapters.getMeta()) != null && !meta.getCan_delete()) {
                    return Boolean.FALSE;
                }
                readsDao = this.readsDao;
                readMetaSyncStatusUpdate = new ReadsDao.ReadMetaSyncStatusUpdate(str, SyncState.PENDING_DELETE);
                readsServiceImpl$remove$1.L$0 = str;
                readsServiceImpl$remove$1.L$1 = readMetaEntityWithChapters;
                readsServiceImpl$remove$1.label = 2;
                if (readsDao.updateStatus(readMetaSyncStatusUpdate, readsServiceImpl$remove$1) != obj) {
                    str2 = str;
                    readMetaEntityWithChapters2 = readMetaEntityWithChapters;
                    if (readMetaEntityWithChapters2 != null) {
                    }
                    ReadsAPI readsAPI22 = this.readsAPI;
                    readsServiceImpl$remove$1.L$0 = null;
                    readsServiceImpl$remove$1.L$1 = readMetaEntityWithChapters2;
                    readsServiceImpl$remove$1.L$2 = null;
                    readsServiceImpl$remove$1.label = 4;
                    obj2 = readsAPI22.removeRead(str2, readsServiceImpl$remove$1);
                }
                return obj;
            }
        }
        readsServiceImpl$remove$1 = new ReadsServiceImpl$remove$1(this, cVar);
        Object obj22 = readsServiceImpl$remove$1.result;
        i10 = readsServiceImpl$remove$1.label;
        boolean z62 = false;
        obj = xn.a.f37986a;
        if (i10 == 0) {
        }
        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj22;
        if (readMetaEntityWithChapters == null) {
        }
        readsDao = this.readsDao;
        readMetaSyncStatusUpdate = new ReadsDao.ReadMetaSyncStatusUpdate(str, SyncState.PENDING_DELETE);
        readsServiceImpl$remove$1.L$0 = str;
        readsServiceImpl$remove$1.L$1 = readMetaEntityWithChapters;
        readsServiceImpl$remove$1.label = 2;
        if (readsDao.updateStatus(readMetaSyncStatusUpdate, readsServiceImpl$remove$1) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r10 == r5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeSampleReadFromLibrary(String str, wn.c<? super Boolean> cVar) {
        ReadsServiceImpl$removeSampleReadFromLibrary$1 readsServiceImpl$removeSampleReadFromLibrary$1;
        int i10;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        if (cVar instanceof ReadsServiceImpl$removeSampleReadFromLibrary$1) {
            readsServiceImpl$removeSampleReadFromLibrary$1 = (ReadsServiceImpl$removeSampleReadFromLibrary$1) cVar;
            int i11 = readsServiceImpl$removeSampleReadFromLibrary$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$removeSampleReadFromLibrary$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$removeSampleReadFromLibrary$1.result;
                i10 = readsServiceImpl$removeSampleReadFromLibrary$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ib.i.r("findAndDeleteSampleRead - parentReadId=", str, this.logger, this.tag);
                    ReadsDao readsDao = this.readsDao;
                    readsServiceImpl$removeSampleReadFromLibrary$1.L$0 = null;
                    readsServiceImpl$removeSampleReadFromLibrary$1.label = 1;
                    obj = readsDao.getSampleReadsByParentId(str, readsServiceImpl$removeSampleReadFromLibrary$1);
                }
                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) o.y0((List) obj);
                if (readMetaEntityWithChapters == null) {
                    this.logger.log(this.tag, "Deleting sample read: " + readMetaEntityWithChapters.getMeta().getRead_id());
                    String read_id = readMetaEntityWithChapters.getMeta().getRead_id();
                    readsServiceImpl$removeSampleReadFromLibrary$1.L$0 = null;
                    readsServiceImpl$removeSampleReadFromLibrary$1.L$1 = null;
                    readsServiceImpl$removeSampleReadFromLibrary$1.label = 2;
                    Object remove = remove(read_id, readsServiceImpl$removeSampleReadFromLibrary$1);
                    if (remove == obj2) {
                        return obj2;
                    }
                    return remove;
                }
                return Boolean.FALSE;
            }
        }
        readsServiceImpl$removeSampleReadFromLibrary$1 = new ReadsServiceImpl$removeSampleReadFromLibrary$1(this, cVar);
        Object obj3 = readsServiceImpl$removeSampleReadFromLibrary$1.result;
        i10 = readsServiceImpl$removeSampleReadFromLibrary$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) o.y0((List) obj3);
        if (readMetaEntityWithChapters == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retryPodcast(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        ReadsServiceImpl$retryPodcast$1 readsServiceImpl$retryPodcast$1;
        int i10;
        if (cVar instanceof ReadsServiceImpl$retryPodcast$1) {
            readsServiceImpl$retryPodcast$1 = (ReadsServiceImpl$retryPodcast$1) cVar;
            int i11 = readsServiceImpl$retryPodcast$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$retryPodcast$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$retryPodcast$1.result;
                i10 = readsServiceImpl$retryPodcast$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReadsAPI readsAPI = this.readsAPI;
                    readsServiceImpl$retryPodcast$1.L$0 = null;
                    readsServiceImpl$retryPodcast$1.label = 1;
                    obj = readsAPI.retryPodcast(str, readsServiceImpl$retryPodcast$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        readsServiceImpl$retryPodcast$1 = new ReadsServiceImpl$retryPodcast$1(this, cVar);
        Object obj2 = readsServiceImpl$retryPodcast$1.result;
        i10 = readsServiceImpl$retryPodcast$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object search(String str, int i10, wn.c<? super ir.i> cVar) {
        if (n.m0(str)) {
            return new a7.u(t.f33547a, 3);
        }
        List<String> z02 = n.z0(str, new String[]{Separators.SP}, 6);
        this.logger.log(this.tag, android.gov.nist.javax.sip.header.a.j(str.length(), "search - length=", ", words=", z02.size()));
        StringBuilder sb = new StringBuilder("SELECT * FROM reads WHERE ");
        Iterator it = ig.f.x(z02).iterator();
        while (((no.f) it).f24561c) {
            int nextInt = ((y) it).nextInt();
            sb.append("((title IS NOT NULL AND title <> '' AND title COLLATE NOCASE LIKE '%' || ? || '%') OR (author IS NOT NULL AND author <> '' AND author COLLATE NOCASE LIKE '%' || ? || '%') OR (url IS NOT NULL AND url <> '' AND url COLLATE NOCASE LIKE '%' || ? || '%') ) ");
            if (nextInt != z02.size() - 1) {
                sb.append("AND ");
            }
        }
        sb.append("ORDER BY updated_at_unix DESC LIMIT ?");
        ArrayList arrayList = new ArrayList();
        for (String str2 : z02) {
            arrayList.add(str2);
            arrayList.add(str2);
            arrayList.add(str2);
        }
        arrayList.add(String.valueOf(i10));
        final ir.i search = this.readsDao.search(new hq.b(sb.toString(), arrayList.toArray(new String[0]), 20));
        final ir.i iVar = new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$1$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$1$2$1, reason: invalid class name */
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
                                ArrayList arrayList = new ArrayList();
                                for (T t10 : (List) obj) {
                                    if (((ReadMetaEntityWithChapters) t10).getMeta().getSync_state() != SyncState.PENDING_DELETE) {
                                        arrayList.add(t10);
                                    }
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
        return new w(new ir.i() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$2

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$2$2", f = "ReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$search$$inlined$map$2$2$1, reason: invalid class name */
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
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(ReadMappingKt.toDomain((ReadMetaEntityWithChapters) it.next()));
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }, new ReadsServiceImpl$search$5(this, null), 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:11:0x002f, B:12:0x0079, B:14:0x007f, B:17:0x0098, B:22:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x00a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a0, blocks: (B:11:0x002f, B:12:0x0079, B:14:0x007f, B:17:0x0098, B:22:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shareRead(String str, wn.c<? super AsyncCallResult<ReadShareResult>> cVar) {
        ReadsServiceImpl$shareRead$1 readsServiceImpl$shareRead$1;
        int i10;
        File file;
        FileDownloadState fileDownloadState;
        try {
            if (cVar instanceof ReadsServiceImpl$shareRead$1) {
                readsServiceImpl$shareRead$1 = (ReadsServiceImpl$shareRead$1) cVar;
                int i11 = readsServiceImpl$shareRead$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    readsServiceImpl$shareRead$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = readsServiceImpl$shareRead$1.result;
                    i10 = readsServiceImpl$shareRead$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            file = (File) readsServiceImpl$shareRead$1.L$1;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        File file2 = new File(this.fileService.getCacheDirectory(), "shared/" + str + ".mp4");
                        ir.i downloadFile = FileDownloadExtensionKt.downloadFile(file2, this.json, new ReadsServiceImpl$shareRead$flow$1(this, str, null));
                        readsServiceImpl$shareRead$1.L$0 = null;
                        readsServiceImpl$shareRead$1.L$1 = file2;
                        readsServiceImpl$shareRead$1.L$2 = null;
                        readsServiceImpl$shareRead$1.label = 1;
                        Object A = r.A(downloadFile, readsServiceImpl$shareRead$1);
                        xn.a aVar = xn.a.f37986a;
                        if (A == aVar) {
                            return aVar;
                        }
                        obj = A;
                        file = file2;
                    }
                    fileDownloadState = (FileDownloadState) obj;
                    if (!(fileDownloadState instanceof FileDownloadState.Finished)) {
                        return new AsyncCallResult.Success(new ReadShareResult(file, ((FileDownloadState.Finished) fileDownloadState).getHeaders().get("share-url")));
                    }
                    return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
                }
            }
            if (i10 == 0) {
            }
            fileDownloadState = (FileDownloadState) obj;
            if (!(fileDownloadState instanceof FileDownloadState.Finished)) {
            }
        } catch (Exception unused) {
            return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
        }
        readsServiceImpl$shareRead$1 = new ReadsServiceImpl$shareRead$1(this, cVar);
        Object obj2 = readsServiceImpl$shareRead$1.result;
        i10 = readsServiceImpl$shareRead$1.label;
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public n1 sync() {
        e0 e0Var;
        ir.e j4 = r.j(new ReadsServiceImpl$sync$1(this, null));
        kr.d F = g0.F(this.coroutineScope, this.dispatcherFactory.getDefault());
        y1 y1Var = new y1(2000L, Long.MAX_VALUE);
        uf.n m10 = r.m(j4, 0);
        q1 a10 = r.a(0, m10.f34359a, (hr.a) m10.f34361c);
        wn.h hVar = (wn.h) m10.f34362d;
        ir.i iVar = (ir.i) m10.f34360b;
        com.google.gson.internal.e eVar = r.f18033c;
        if (y1Var.equals(t1.f18063a)) {
            e0Var = e0.f9812a;
        } else {
            e0Var = e0.f9815d;
        }
        g0.C(F, hVar, e0Var, new u0(y1Var, iVar, a10, eVar, (wn.c) null));
        return new k1(a10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object unarchive(String str, wn.c<? super z> cVar) {
        ReadsServiceImpl$unarchive$1 readsServiceImpl$unarchive$1;
        int i10;
        if (cVar instanceof ReadsServiceImpl$unarchive$1) {
            readsServiceImpl$unarchive$1 = (ReadsServiceImpl$unarchive$1) cVar;
            int i11 = readsServiceImpl$unarchive$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$unarchive$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$unarchive$1.result;
                i10 = readsServiceImpl$unarchive$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.readsDao.updateArchivedStatus(new ReadsDao.ReadMetaArchiveUpdate(str, false));
                    ReadsAPI readsAPI = this.readsAPI;
                    readsServiceImpl$unarchive$1.L$0 = null;
                    readsServiceImpl$unarchive$1.label = 1;
                    obj = readsAPI.unarchiveRead(str, readsServiceImpl$unarchive$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                ApiResultExtensionKt.toDomain((ApiResult) obj);
                return z.f31622a;
            }
        }
        readsServiceImpl$unarchive$1 = new ReadsServiceImpl$unarchive$1(this, cVar);
        Object obj2 = readsServiceImpl$unarchive$1.result;
        i10 = readsServiceImpl$unarchive$1.label;
        if (i10 == 0) {
        }
        ApiResultExtensionKt.toDomain((ApiResult) obj2);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateAudioPosition(String str, String str2, double d10, wn.c<? super z> cVar) {
        ReadsServiceImpl$updateAudioPosition$1 readsServiceImpl$updateAudioPosition$1;
        int i10;
        long j4;
        if (cVar instanceof ReadsServiceImpl$updateAudioPosition$1) {
            readsServiceImpl$updateAudioPosition$1 = (ReadsServiceImpl$updateAudioPosition$1) cVar;
            int i11 = readsServiceImpl$updateAudioPosition$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$updateAudioPosition$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$updateAudioPosition$1.result;
                i10 = readsServiceImpl$updateAudioPosition$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.readsDao.updateAudioPosition(new ReadsDao.ReadMetaAudioPositionUpdate(str, str2, d10, (SyncState) null, 8, (kotlin.jvm.internal.f) null));
                    readsServiceImpl$updateAudioPosition$1.L$0 = null;
                    readsServiceImpl$updateAudioPosition$1.L$1 = null;
                    readsServiceImpl$updateAudioPosition$1.D$0 = d10;
                    readsServiceImpl$updateAudioPosition$1.label = 1;
                    Object completedAtIfNeeded = setCompletedAtIfNeeded(str, readsServiceImpl$updateAudioPosition$1);
                    Object obj2 = xn.a.f37986a;
                    if (completedAtIfNeeded == obj2) {
                        return obj2;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                j4 = currentTimeMillis - this.lastFlushTimestamp;
                xq.a aVar = xq.b.f38124b;
                if (j4 > xq.b.d(xq.g.n(1, xq.d.MINUTES))) {
                    this.logger.log(this.tag, "Scheduling listening positions flush");
                    this.lastFlushTimestamp = currentTimeMillis;
                    SyncListeningPositionWorker.INSTANCE.enqueue(this.appContext);
                }
                return z.f31622a;
            }
        }
        readsServiceImpl$updateAudioPosition$1 = new ReadsServiceImpl$updateAudioPosition$1(this, cVar);
        Object obj3 = readsServiceImpl$updateAudioPosition$1.result;
        i10 = readsServiceImpl$updateAudioPosition$1.label;
        if (i10 == 0) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        j4 = currentTimeMillis2 - this.lastFlushTimestamp;
        xq.a aVar2 = xq.b.f38124b;
        if (j4 > xq.b.d(xq.g.n(1, xq.d.MINUTES))) {
        }
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // io.elevenlabs.domain.services.ReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateLastCharacterOffset(String str, long j4, wn.c<? super z> cVar) {
        ReadsServiceImpl$updateLastCharacterOffset$1 readsServiceImpl$updateLastCharacterOffset$1;
        int i10;
        long j10;
        if (cVar instanceof ReadsServiceImpl$updateLastCharacterOffset$1) {
            readsServiceImpl$updateLastCharacterOffset$1 = (ReadsServiceImpl$updateLastCharacterOffset$1) cVar;
            int i11 = readsServiceImpl$updateLastCharacterOffset$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readsServiceImpl$updateLastCharacterOffset$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readsServiceImpl$updateLastCharacterOffset$1.result;
                i10 = readsServiceImpl$updateLastCharacterOffset$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.readsDao.updateLastCharOffset(new ReadsDao.ReadMetaLastCharOffsetUpdate(str, j4, (SyncState) null, 4, (kotlin.jvm.internal.f) null));
                    readsServiceImpl$updateLastCharacterOffset$1.L$0 = null;
                    readsServiceImpl$updateLastCharacterOffset$1.J$0 = j4;
                    readsServiceImpl$updateLastCharacterOffset$1.label = 1;
                    Object completedAtIfNeeded = setCompletedAtIfNeeded(str, readsServiceImpl$updateLastCharacterOffset$1);
                    Object obj2 = xn.a.f37986a;
                    if (completedAtIfNeeded == obj2) {
                        return obj2;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                j10 = currentTimeMillis - this.lastFlushTimestamp;
                xq.a aVar = xq.b.f38124b;
                if (j10 > xq.b.d(xq.g.n(1, xq.d.MINUTES))) {
                    this.logger.log(this.tag, "Scheduling listening positions flush");
                    this.lastFlushTimestamp = currentTimeMillis;
                    SyncListeningPositionWorker.INSTANCE.enqueue(this.appContext);
                }
                return z.f31622a;
            }
        }
        readsServiceImpl$updateLastCharacterOffset$1 = new ReadsServiceImpl$updateLastCharacterOffset$1(this, cVar);
        Object obj3 = readsServiceImpl$updateLastCharacterOffset$1.result;
        i10 = readsServiceImpl$updateLastCharacterOffset$1.label;
        if (i10 == 0) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        j10 = currentTimeMillis2 - this.lastFlushTimestamp;
        xq.a aVar2 = xq.b.f38124b;
        if (j10 > xq.b.d(xq.g.n(1, xq.d.MINUTES))) {
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object updateLastUsedVoiceId(String str, String str2, wn.c<? super z> cVar) {
        String str3;
        if (kotlin.jvm.internal.m.c(str2, EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
            str3 = "media";
        } else {
            str3 = "tts";
        }
        this.readsDao.updateLastVoiceId(new ReadsDao.ReadMetaLastVoiceIdUpdate(str, str2, str3));
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object updateTitle(String str, String str2, wn.c<? super z> cVar) {
        this.readsDao.updateTitle(new ReadsDao.ReadMetaTitleUpdate(str, str2, (SyncState) null, 4, (kotlin.jvm.internal.f) null));
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.ReadsService
    public Object getReads(List<String> list, wn.c<? super List<ReadMeta>> cVar) {
        return g0.Q(this.dispatcherFactory.getDefault(), new ReadsServiceImpl$getReads$5(this, list, null), cVar);
    }
}
