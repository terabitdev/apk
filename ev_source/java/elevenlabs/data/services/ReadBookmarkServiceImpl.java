package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.u0;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import fr.d0;
import fr.e0;
import fr.g0;
import io.elevenlabs.data.api.ReadBookmarksAPI;
import io.elevenlabs.data.api.ReadBookmarksVideoAPI;
import io.elevenlabs.data.database.entities.bookmarks.BookmarkEntity;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.FileDownloadExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyCreateBookmarkBookmarksReadIdBookmarkPost;
import io.elevenlabs.data.model.BodyUpdateBookmarkBookmarksBookmarkIdPut;
import io.elevenlabs.data.model.response.BookmarkMarkdownResponseModel;
import io.elevenlabs.data.model.response.BookmarkResponseModel;
import io.elevenlabs.data.serializer.JsonKt;
import io.elevenlabs.data.worker.BookmarkSyncWorker;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.BookmarkAudioPositionResult;
import io.elevenlabs.domain.model.BookmarkAudioPositionValidator;
import io.elevenlabs.domain.model.BookmarkRange;
import io.elevenlabs.domain.model.BookmarkShareResult;
import io.elevenlabs.domain.model.CreateBookmarkRequest;
import io.elevenlabs.domain.model.FileDownloadState;
import io.elevenlabs.domain.model.InvalidBookmarkAudioPositionException;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.k1;
import ir.q1;
import ir.r;
import ir.t1;
import ir.y1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import tn.p;
import uf.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001XBm\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b(\u0010!J$\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0&0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b*\u0010!J \u0010-\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020+H\u0096@¢\u0006\u0004\b-\u0010.J \u00101\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b1\u00102J(\u00104\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b4\u00105J\u001e\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c062\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b7\u0010!J&\u0010:\u001a\b\u0012\u0004\u0012\u000209062\u0006\u0010/\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b:\u00102J \u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001e2\u0006\u0010/\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b;\u0010!J\u001a\u0010>\u001a\u0004\u0018\u00010\u001c2\u0006\u0010=\u001a\u00020<H\u0082@¢\u0006\u0004\b>\u0010?J\u0018\u0010A\u001a\u00020@2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bA\u0010!J\u0018\u0010B\u001a\u00020@2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bB\u0010!J\u0018\u0010C\u001a\u00020@2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bC\u0010!J\u0018\u0010D\u001a\u00020@2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\bD\u0010!J\u001d\u0010G\u001a\u00020<*\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bG\u0010HJ\u0014\u0010I\u001a\u00020'*\u00020<H\u0082@¢\u0006\u0004\bI\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010OR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010SR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010TR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010UR\u0014\u0010V\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lio/elevenlabs/data/services/ReadBookmarkServiceImpl;", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/data/api/ReadBookmarksAPI;", "api", "Lio/elevenlabs/data/api/ReadBookmarksVideoAPI;", "apiVideo", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "bookmarksDao", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "currentTimeUseCase", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lfr/d0;", "coroutineScope", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Landroid/content/Context;", "appContext", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/FileService;Lio/elevenlabs/data/api/ReadBookmarksAPI;Lio/elevenlabs/data/api/ReadBookmarksVideoAPI;Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;Lio/elevenlabs/domain/DispatcherFactory;Lfr/d0;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/services/ConnectivityService;Landroid/content/Context;)V", "", "readId", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "maxCount", "syncAllPending", "(ILwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/domain/model/Bookmark;", "getBookmarks", "Lio/elevenlabs/domain/model/BookmarkRange;", "getBookmarkRanges", "Lio/elevenlabs/domain/model/CreateBookmarkRequest;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createBookmark", "(Ljava/lang/String;Lio/elevenlabs/domain/model/CreateBookmarkRequest;Lwn/c;)Ljava/lang/Object;", "bookmarkId", "Lsn/z;", "deleteBookmark", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "note", "updateBookmark", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "downloadBookmarksMarkdown", "voiceId", "Lio/elevenlabs/domain/model/BookmarkShareResult;", "shareBookmark", "observeBookmark", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", BackgroundPlayerAction.Bookmark.ACTION_ID, "syncPendingCreateBookmark", "(Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;Lwn/c;)Ljava/lang/Object;", "", "syncPendingCreates", "syncPendingDeletes", "syncPendingUpdates", "syncRemoteChanges", "Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "createdId", "toEntity", "(Lio/elevenlabs/data/model/response/BookmarkResponseModel;Ljava/lang/String;)Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "toDomain", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/FileService;", "Lio/elevenlabs/data/api/ReadBookmarksAPI;", "Lio/elevenlabs/data/api/ReadBookmarksVideoAPI;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lfr/d0;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Landroid/content/Context;", ParameterNames.TAG, "Ljava/lang/String;", "BookmarkSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadBookmarkServiceImpl implements ReadBookmarkService {
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final ReadBookmarksAPI api;
    private final ReadBookmarksVideoAPI apiVideo;
    private final AppCheckTokenService appCheckTokenService;
    private final Context appContext;
    private final BookmarksDao bookmarksDao;
    private final ConnectivityService connectivityService;
    private final d0 coroutineScope;
    private final GetCurrentTimeUseCase currentTimeUseCase;
    private final DispatcherFactory dispatcherFactory;
    private final FileService fileService;
    private final Logger logger;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/ReadBookmarkServiceImpl$BookmarkSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class BookmarkSyncException extends Exception {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookmarkEntity.SyncState.values().length];
            try {
                iArr[BookmarkEntity.SyncState.PENDING_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReadBookmarkServiceImpl(Logger logger, FileService fileService, ReadBookmarksAPI readBookmarksAPI, ReadBookmarksVideoAPI readBookmarksVideoAPI, BookmarksDao bookmarksDao, GetCurrentTimeUseCase getCurrentTimeUseCase, DispatcherFactory dispatcherFactory, @ApplicationCoroutineScope d0 d0Var, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, ConnectivityService connectivityService, Context context) {
        logger.getClass();
        fileService.getClass();
        readBookmarksAPI.getClass();
        readBookmarksVideoAPI.getClass();
        bookmarksDao.getClass();
        getCurrentTimeUseCase.getClass();
        dispatcherFactory.getClass();
        d0Var.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        connectivityService.getClass();
        context.getClass();
        this.logger = logger;
        this.fileService = fileService;
        this.api = readBookmarksAPI;
        this.apiVideo = readBookmarksVideoAPI;
        this.bookmarksDao = bookmarksDao;
        this.currentTimeUseCase = getCurrentTimeUseCase;
        this.dispatcherFactory = dispatcherFactory;
        this.coroutineScope = d0Var;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.connectivityService = connectivityService;
        this.appContext = context;
        this.tag = "ReadBookmarkService";
    }

    public static /* synthetic */ String a(BookmarkMarkdownResponseModel bookmarkMarkdownResponseModel) {
        return downloadBookmarksMarkdown$lambda$0(bookmarkMarkdownResponseModel);
    }

    public static final String downloadBookmarksMarkdown$lambda$0(BookmarkMarkdownResponseModel bookmarkMarkdownResponseModel) {
        bookmarkMarkdownResponseModel.getClass();
        return bookmarkMarkdownResponseModel.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncPendingCreateBookmark(BookmarkEntity bookmarkEntity, wn.c<? super String> cVar) {
        ReadBookmarkServiceImpl$syncPendingCreateBookmark$1 readBookmarkServiceImpl$syncPendingCreateBookmark$1;
        int i10;
        BookmarkEntity bookmarkEntity2;
        ApiResult apiResult;
        if (cVar instanceof ReadBookmarkServiceImpl$syncPendingCreateBookmark$1) {
            readBookmarkServiceImpl$syncPendingCreateBookmark$1 = (ReadBookmarkServiceImpl$syncPendingCreateBookmark$1) cVar;
            int i11 = readBookmarkServiceImpl$syncPendingCreateBookmark$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$syncPendingCreateBookmark$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$syncPendingCreateBookmark$1.result;
                i10 = readBookmarkServiceImpl$syncPendingCreateBookmark$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        BookmarkEntity bookmarkEntity3 = (BookmarkEntity) readBookmarkServiceImpl$syncPendingCreateBookmark$1.L$0;
                        sn.a.g(obj);
                        bookmarkEntity2 = bookmarkEntity3;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReadBookmarksAPI readBookmarksAPI = this.api;
                    String read_id = bookmarkEntity.getRead_id();
                    BodyCreateBookmarkBookmarksReadIdBookmarkPost bodyCreateBookmarkBookmarksReadIdBookmarkPost = new BodyCreateBookmarkBookmarksReadIdBookmarkPost(bookmarkEntity.getStart_offset_inclusive(), bookmarkEntity.getEnd_offset_exclusive(), bookmarkEntity.getText(), bookmarkEntity.getCreated_at_unix(), bookmarkEntity.getUpdated_at_unix(), bookmarkEntity.getNote(), bookmarkEntity.getChapter_index(), bookmarkEntity.getStart_time_seconds(), bookmarkEntity.getEnd_time_seconds());
                    readBookmarkServiceImpl$syncPendingCreateBookmark$1.L$0 = bookmarkEntity;
                    readBookmarkServiceImpl$syncPendingCreateBookmark$1.label = 1;
                    obj = readBookmarksAPI.createBookmark(read_id, bodyCreateBookmarkBookmarksReadIdBookmarkPost, readBookmarkServiceImpl$syncPendingCreateBookmark$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                    bookmarkEntity2 = bookmarkEntity;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ApiResult.Success success = (ApiResult.Success) apiResult;
                    this.bookmarksDao.insert(BookmarkEntity.copy$default(bookmarkEntity2, ((BookmarkResponseModel) success.getData()).getBookmarkId(), null, 0L, 0L, null, 0L, 0L, null, BookmarkEntity.SyncState.UPDATED, bookmarkEntity2.getId(), null, null, null, 7422, null));
                    this.bookmarksDao.deleteBookmark(bookmarkEntity2);
                    return ((BookmarkResponseModel) success.getData()).getBookmarkId();
                }
                if (apiResult instanceof ApiResult.Error) {
                    return null;
                }
                c6.p();
                return null;
            }
        }
        readBookmarkServiceImpl$syncPendingCreateBookmark$1 = new ReadBookmarkServiceImpl$syncPendingCreateBookmark$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$syncPendingCreateBookmark$1.result;
        i10 = readBookmarkServiceImpl$syncPendingCreateBookmark$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        if (r9 == r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r9 == r6) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0091 -> B:11:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncPendingCreates(String str, wn.c<? super Boolean> cVar) {
        ReadBookmarkServiceImpl$syncPendingCreates$1 readBookmarkServiceImpl$syncPendingCreates$1;
        int i10;
        Iterator it;
        int i11;
        if (cVar instanceof ReadBookmarkServiceImpl$syncPendingCreates$1) {
            readBookmarkServiceImpl$syncPendingCreates$1 = (ReadBookmarkServiceImpl$syncPendingCreates$1) cVar;
            int i12 = readBookmarkServiceImpl$syncPendingCreates$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$syncPendingCreates$1.label = i12 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$syncPendingCreates$1.result;
                i10 = readBookmarkServiceImpl$syncPendingCreates$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = readBookmarkServiceImpl$syncPendingCreates$1.I$0;
                            it = (Iterator) readBookmarkServiceImpl$syncPendingCreates$1.L$3;
                            sn.a.g(obj);
                            if (obj == null) {
                                return Boolean.FALSE;
                            }
                            if (it.hasNext()) {
                                BookmarkEntity bookmarkEntity = (BookmarkEntity) it.next();
                                readBookmarkServiceImpl$syncPendingCreates$1.L$0 = null;
                                readBookmarkServiceImpl$syncPendingCreates$1.L$1 = null;
                                readBookmarkServiceImpl$syncPendingCreates$1.L$2 = null;
                                readBookmarkServiceImpl$syncPendingCreates$1.L$3 = it;
                                readBookmarkServiceImpl$syncPendingCreates$1.L$4 = null;
                                readBookmarkServiceImpl$syncPendingCreates$1.L$5 = null;
                                readBookmarkServiceImpl$syncPendingCreates$1.I$0 = i11;
                                readBookmarkServiceImpl$syncPendingCreates$1.I$1 = 0;
                                readBookmarkServiceImpl$syncPendingCreates$1.label = 2;
                                obj = syncPendingCreateBookmark(bookmarkEntity, readBookmarkServiceImpl$syncPendingCreates$1);
                            } else {
                                return Boolean.TRUE;
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ir.i allWithSyncState = this.bookmarksDao.getAllWithSyncState(str, BookmarkEntity.SyncState.PENDING_CREATE);
                    readBookmarkServiceImpl$syncPendingCreates$1.L$0 = null;
                    readBookmarkServiceImpl$syncPendingCreates$1.label = 1;
                    obj = r.u(allWithSyncState, readBookmarkServiceImpl$syncPendingCreates$1);
                }
                it = ((List) obj).iterator();
                i11 = 0;
                if (it.hasNext()) {
                }
            }
        }
        readBookmarkServiceImpl$syncPendingCreates$1 = new ReadBookmarkServiceImpl$syncPendingCreates$1(this, cVar);
        Object obj3 = readBookmarkServiceImpl$syncPendingCreates$1.result;
        i10 = readBookmarkServiceImpl$syncPendingCreates$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        it = ((List) obj3).iterator();
        i11 = 0;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r10 == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r10 == r6) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:11:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncPendingDeletes(String str, wn.c<? super Boolean> cVar) {
        ReadBookmarkServiceImpl$syncPendingDeletes$1 readBookmarkServiceImpl$syncPendingDeletes$1;
        int i10;
        Iterator it;
        int i11;
        if (cVar instanceof ReadBookmarkServiceImpl$syncPendingDeletes$1) {
            readBookmarkServiceImpl$syncPendingDeletes$1 = (ReadBookmarkServiceImpl$syncPendingDeletes$1) cVar;
            int i12 = readBookmarkServiceImpl$syncPendingDeletes$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$syncPendingDeletes$1.label = i12 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$syncPendingDeletes$1.result;
                i10 = readBookmarkServiceImpl$syncPendingDeletes$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = readBookmarkServiceImpl$syncPendingDeletes$1.I$0;
                            BookmarkEntity bookmarkEntity = (BookmarkEntity) readBookmarkServiceImpl$syncPendingDeletes$1.L$5;
                            it = (Iterator) readBookmarkServiceImpl$syncPendingDeletes$1.L$3;
                            sn.a.g(obj);
                            ApiResult apiResult = (ApiResult) obj;
                            if (apiResult instanceof ApiResult.Success) {
                                this.bookmarksDao.deleteBookmark(bookmarkEntity);
                                if (it.hasNext()) {
                                    bookmarkEntity = (BookmarkEntity) it.next();
                                    ReadBookmarksAPI readBookmarksAPI = this.api;
                                    String id2 = bookmarkEntity.getId();
                                    readBookmarkServiceImpl$syncPendingDeletes$1.L$0 = null;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.L$1 = null;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.L$2 = null;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.L$3 = it;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.L$4 = null;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.L$5 = bookmarkEntity;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.I$0 = i11;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.I$1 = 0;
                                    readBookmarkServiceImpl$syncPendingDeletes$1.label = 2;
                                    obj = readBookmarksAPI.deleteBookmark(id2, readBookmarkServiceImpl$syncPendingDeletes$1);
                                } else {
                                    return Boolean.TRUE;
                                }
                            } else {
                                if (apiResult instanceof ApiResult.Error) {
                                    Logger.logWarning$default(this.logger, this.tag, defpackage.f.i("Failed to delete bookmark: ", bookmarkEntity.getId()), null, 4, null);
                                    if ((apiResult instanceof ApiResult.Error.ApiError) && m.c(((ApiResult.Error.ApiError) apiResult).getCode(), "bookmark_not_found")) {
                                        this.bookmarksDao.deleteBookmark(bookmarkEntity);
                                        return Boolean.TRUE;
                                    }
                                    return Boolean.FALSE;
                                }
                                c6.p();
                                return null;
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ir.i allWithSyncState = this.bookmarksDao.getAllWithSyncState(str, BookmarkEntity.SyncState.PENDING_DELETE);
                    readBookmarkServiceImpl$syncPendingDeletes$1.L$0 = null;
                    readBookmarkServiceImpl$syncPendingDeletes$1.label = 1;
                    obj = r.u(allWithSyncState, readBookmarkServiceImpl$syncPendingDeletes$1);
                }
                it = ((List) obj).iterator();
                i11 = 0;
                if (it.hasNext()) {
                }
            }
        }
        readBookmarkServiceImpl$syncPendingDeletes$1 = new ReadBookmarkServiceImpl$syncPendingDeletes$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$syncPendingDeletes$1.result;
        i10 = readBookmarkServiceImpl$syncPendingDeletes$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        it = ((List) obj2).iterator();
        i11 = 0;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (r1 == r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (r1 == r8) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b0 -> B:11:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncPendingUpdates(String str, wn.c<? super Boolean> cVar) {
        ReadBookmarkServiceImpl$syncPendingUpdates$1 readBookmarkServiceImpl$syncPendingUpdates$1;
        int i10;
        Iterator it;
        int i11;
        if (cVar instanceof ReadBookmarkServiceImpl$syncPendingUpdates$1) {
            readBookmarkServiceImpl$syncPendingUpdates$1 = (ReadBookmarkServiceImpl$syncPendingUpdates$1) cVar;
            int i12 = readBookmarkServiceImpl$syncPendingUpdates$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$syncPendingUpdates$1.label = i12 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$syncPendingUpdates$1.result;
                i10 = readBookmarkServiceImpl$syncPendingUpdates$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = readBookmarkServiceImpl$syncPendingUpdates$1.I$0;
                            BookmarkEntity bookmarkEntity = (BookmarkEntity) readBookmarkServiceImpl$syncPendingUpdates$1.L$5;
                            it = (Iterator) readBookmarkServiceImpl$syncPendingUpdates$1.L$3;
                            sn.a.g(obj);
                            Iterator it2 = it;
                            BookmarkEntity bookmarkEntity2 = bookmarkEntity;
                            ApiResult apiResult = (ApiResult) obj;
                            if (apiResult instanceof ApiResult.Success) {
                                this.bookmarksDao.update(BookmarkEntity.copy$default(bookmarkEntity2, null, null, 0L, 0L, null, 0L, 0L, null, BookmarkEntity.SyncState.UPDATED, bookmarkEntity2.getCreated_id(), null, null, null, 7423, null));
                                it = it2;
                                if (it.hasNext()) {
                                    bookmarkEntity = (BookmarkEntity) it.next();
                                    ReadBookmarksAPI readBookmarksAPI = this.api;
                                    String id2 = bookmarkEntity.getId();
                                    BodyUpdateBookmarkBookmarksBookmarkIdPut bodyUpdateBookmarkBookmarksBookmarkIdPut = new BodyUpdateBookmarkBookmarksBookmarkIdPut(bookmarkEntity.getUpdated_at_unix(), bookmarkEntity.getNote());
                                    readBookmarkServiceImpl$syncPendingUpdates$1.L$0 = null;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.L$1 = null;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.L$2 = null;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.L$3 = it;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.L$4 = null;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.L$5 = bookmarkEntity;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.I$0 = i11;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.I$1 = 0;
                                    readBookmarkServiceImpl$syncPendingUpdates$1.label = 2;
                                    obj = readBookmarksAPI.updateBookmarkBookmarksBookmarkIdPut(id2, bodyUpdateBookmarkBookmarksBookmarkIdPut, readBookmarkServiceImpl$syncPendingUpdates$1);
                                } else {
                                    return Boolean.TRUE;
                                }
                            } else {
                                if (apiResult instanceof ApiResult.Error) {
                                    return Boolean.FALSE;
                                }
                                c6.p();
                                return null;
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ir.i allWithSyncState = this.bookmarksDao.getAllWithSyncState(str, BookmarkEntity.SyncState.PENDING_UPDATE_PUSH);
                    readBookmarkServiceImpl$syncPendingUpdates$1.L$0 = null;
                    readBookmarkServiceImpl$syncPendingUpdates$1.label = 1;
                    obj = r.u(allWithSyncState, readBookmarkServiceImpl$syncPendingUpdates$1);
                }
                it = ((List) obj).iterator();
                i11 = 0;
                if (it.hasNext()) {
                }
            }
        }
        readBookmarkServiceImpl$syncPendingUpdates$1 = new ReadBookmarkServiceImpl$syncPendingUpdates$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$syncPendingUpdates$1.result;
        i10 = readBookmarkServiceImpl$syncPendingUpdates$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        it = ((List) obj2).iterator();
        i11 = 0;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0053, code lost:
    
        if (r10 == r5) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[LOOP:2: B:34:0x00d4->B:36:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncRemoteChanges(String str, wn.c<? super Boolean> cVar) {
        ReadBookmarkServiceImpl$syncRemoteChanges$1 readBookmarkServiceImpl$syncRemoteChanges$1;
        int i10;
        ApiResult apiResult;
        List<BookmarkResponseModel> list;
        Iterator it;
        Object obj;
        if (cVar instanceof ReadBookmarkServiceImpl$syncRemoteChanges$1) {
            readBookmarkServiceImpl$syncRemoteChanges$1 = (ReadBookmarkServiceImpl$syncRemoteChanges$1) cVar;
            int i11 = readBookmarkServiceImpl$syncRemoteChanges$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$syncRemoteChanges$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = readBookmarkServiceImpl$syncRemoteChanges$1.result;
                i10 = readBookmarkServiceImpl$syncRemoteChanges$1.label;
                boolean z6 = true;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            list = (List) readBookmarkServiceImpl$syncRemoteChanges$1.L$2;
                            sn.a.g(obj2);
                            Set k12 = o.k1((List) obj2);
                            for (BookmarkResponseModel bookmarkResponseModel : list) {
                                Iterator it2 = k12.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        if (m.c(((BookmarkEntity) obj).getId(), bookmarkResponseModel.getBookmarkId())) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                BookmarkEntity bookmarkEntity = (BookmarkEntity) obj;
                                BookmarksDao bookmarksDao = this.bookmarksDao;
                                if (bookmarkEntity != null) {
                                    bookmarksDao.update(toEntity(bookmarkResponseModel, bookmarkEntity.getCreated_id()));
                                    k12.remove(bookmarkEntity);
                                } else {
                                    bookmarksDao.insert(toEntity(bookmarkResponseModel, null));
                                }
                            }
                            it = k12.iterator();
                            while (it.hasNext()) {
                                this.bookmarksDao.deleteBookmark((BookmarkEntity) it.next());
                            }
                            return Boolean.valueOf(z6);
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) readBookmarkServiceImpl$syncRemoteChanges$1.L$0;
                    sn.a.g(obj2);
                } else {
                    sn.a.g(obj2);
                    ReadBookmarksAPI readBookmarksAPI = this.api;
                    readBookmarkServiceImpl$syncRemoteChanges$1.L$0 = str;
                    readBookmarkServiceImpl$syncRemoteChanges$1.label = 1;
                    obj2 = readBookmarksAPI.getBookmarks(str, readBookmarkServiceImpl$syncRemoteChanges$1);
                }
                apiResult = (ApiResult) obj2;
                if (!(apiResult instanceof ApiResult.Success)) {
                    List list2 = (List) ((ApiResult.Success) apiResult).getData();
                    ir.i all$default = BookmarksDao.getAll$default(this.bookmarksDao, str, null, 2, null);
                    readBookmarkServiceImpl$syncRemoteChanges$1.L$0 = null;
                    readBookmarkServiceImpl$syncRemoteChanges$1.L$1 = null;
                    readBookmarkServiceImpl$syncRemoteChanges$1.L$2 = list2;
                    readBookmarkServiceImpl$syncRemoteChanges$1.label = 2;
                    Object u6 = r.u(all$default, readBookmarkServiceImpl$syncRemoteChanges$1);
                    if (u6 != aVar) {
                        obj2 = u6;
                        list = list2;
                        Set k122 = o.k1((List) obj2);
                        while (r9.hasNext()) {
                        }
                        it = k122.iterator();
                        while (it.hasNext()) {
                        }
                        return Boolean.valueOf(z6);
                    }
                    return aVar;
                }
                if (apiResult instanceof ApiResult.Error) {
                    z6 = false;
                    return Boolean.valueOf(z6);
                }
                c6.p();
                return null;
            }
        }
        readBookmarkServiceImpl$syncRemoteChanges$1 = new ReadBookmarkServiceImpl$syncRemoteChanges$1(this, cVar);
        Object obj22 = readBookmarkServiceImpl$syncRemoteChanges$1.result;
        i10 = readBookmarkServiceImpl$syncRemoteChanges$1.label;
        boolean z62 = true;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj22;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    public final Object toDomain(BookmarkEntity bookmarkEntity, wn.c<? super Bookmark> cVar) {
        return new Bookmark(bookmarkEntity.getId(), bookmarkEntity.getRead_id(), bookmarkEntity.getStart_offset_inclusive(), bookmarkEntity.getEnd_offset_exclusive(), bookmarkEntity.getText(), new Date(bookmarkEntity.getCreated_at_unix() * 1000), new Date(bookmarkEntity.getUpdated_at_unix() * 1000), bookmarkEntity.getNote(), bookmarkEntity.getChapter_index(), bookmarkEntity.getStart_time_seconds(), bookmarkEntity.getEnd_time_seconds());
    }

    private final BookmarkEntity toEntity(BookmarkResponseModel bookmarkResponseModel, String str) {
        return new BookmarkEntity(bookmarkResponseModel.getBookmarkId(), bookmarkResponseModel.getReadId(), bookmarkResponseModel.getStartOffsetInclusive(), bookmarkResponseModel.getEndOffsetExclusive(), bookmarkResponseModel.getText(), bookmarkResponseModel.getCreatedAtUnix(), bookmarkResponseModel.getUpdatedAtUnix(), bookmarkResponseModel.getNote(), BookmarkEntity.SyncState.UPDATED, str, bookmarkResponseModel.getChapterIndex(), bookmarkResponseModel.getStartTimeSeconds(), bookmarkResponseModel.getEndTimeSeconds());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBookmark(String str, CreateBookmarkRequest createBookmarkRequest, wn.c<? super String> cVar) {
        ReadBookmarkServiceImpl$createBookmark$1 readBookmarkServiceImpl$createBookmark$1;
        int i10;
        Integer num;
        Double d10;
        Double d11;
        String str2;
        CreateBookmarkRequest createBookmarkRequest2;
        Double d12;
        Double d13;
        String str3;
        if (cVar instanceof ReadBookmarkServiceImpl$createBookmark$1) {
            readBookmarkServiceImpl$createBookmark$1 = (ReadBookmarkServiceImpl$createBookmark$1) cVar;
            int i11 = readBookmarkServiceImpl$createBookmark$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$createBookmark$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$createBookmark$1.result;
                i10 = readBookmarkServiceImpl$createBookmark$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        String str4 = (String) readBookmarkServiceImpl$createBookmark$1.L$5;
                        Double d14 = (Double) readBookmarkServiceImpl$createBookmark$1.L$4;
                        Double d15 = (Double) readBookmarkServiceImpl$createBookmark$1.L$3;
                        num = (Integer) readBookmarkServiceImpl$createBookmark$1.L$2;
                        createBookmarkRequest2 = (CreateBookmarkRequest) readBookmarkServiceImpl$createBookmark$1.L$1;
                        String str5 = (String) readBookmarkServiceImpl$createBookmark$1.L$0;
                        sn.a.g(obj);
                        str3 = str5;
                        str2 = str4;
                        d12 = d14;
                        d13 = d15;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    BookmarkAudioPositionResult validate$default = BookmarkAudioPositionValidator.validate$default(BookmarkAudioPositionValidator.INSTANCE, createBookmarkRequest.getChapterIndex(), createBookmarkRequest.getStartTimeSeconds(), createBookmarkRequest.getEndTimeSeconds(), null, 8, null);
                    if (validate$default instanceof BookmarkAudioPositionResult.Absent) {
                        d11 = null;
                        d10 = null;
                        num = null;
                    } else if (validate$default instanceof BookmarkAudioPositionResult.Valid) {
                        BookmarkAudioPositionResult.Valid valid = (BookmarkAudioPositionResult.Valid) validate$default;
                        num = new Integer(valid.getChapterIndex());
                        d10 = new Double(valid.getStartTimeSeconds());
                        d11 = new Double(valid.getEndTimeSeconds());
                    } else {
                        if (!(validate$default instanceof BookmarkAudioPositionResult.Invalid)) {
                            c6.p();
                            return null;
                        }
                        Logger.logWarning$default(this.logger, this.tag, "Refusing to create bookmark with invalid audio position: " + validate$default, null, 4, null);
                        throw new InvalidBookmarkAudioPositionException((BookmarkAudioPositionResult.Invalid) validate$default);
                    }
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    ir.i m958invokeLRDsOJo$default = GetCurrentTimeUseCase.m958invokeLRDsOJo$default(this.currentTimeUseCase, 0L, 1, null);
                    readBookmarkServiceImpl$createBookmark$1.L$0 = str;
                    readBookmarkServiceImpl$createBookmark$1.L$1 = createBookmarkRequest;
                    readBookmarkServiceImpl$createBookmark$1.L$2 = num;
                    readBookmarkServiceImpl$createBookmark$1.L$3 = d10;
                    readBookmarkServiceImpl$createBookmark$1.L$4 = d11;
                    readBookmarkServiceImpl$createBookmark$1.L$5 = uuid;
                    readBookmarkServiceImpl$createBookmark$1.label = 1;
                    Object u6 = r.u(m958invokeLRDsOJo$default, readBookmarkServiceImpl$createBookmark$1);
                    xn.a aVar = xn.a.f37986a;
                    if (u6 == aVar) {
                        return aVar;
                    }
                    str2 = uuid;
                    createBookmarkRequest2 = createBookmarkRequest;
                    d12 = d11;
                    obj = u6;
                    d13 = d10;
                    str3 = str;
                }
                Integer num2 = num;
                long time = ((Date) obj).getTime();
                this.bookmarksDao.insert(new BookmarkEntity(str2, str3, createBookmarkRequest2.getStartOffsetInclusive(), createBookmarkRequest2.getEndOffsetExclusive(), createBookmarkRequest2.getText(), time, time, createBookmarkRequest2.getNote(), BookmarkEntity.SyncState.PENDING_CREATE, str2, num2, d13, d12));
                this.logger.log(this.tag, "Bookmark created locally, enqueueing sync worker");
                BookmarkSyncWorker.INSTANCE.enqueue(this.appContext);
                return str2;
            }
        }
        readBookmarkServiceImpl$createBookmark$1 = new ReadBookmarkServiceImpl$createBookmark$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$createBookmark$1.result;
        i10 = readBookmarkServiceImpl$createBookmark$1.label;
        if (i10 == 0) {
        }
        Integer num22 = num;
        long time2 = ((Date) obj2).getTime();
        this.bookmarksDao.insert(new BookmarkEntity(str2, str3, createBookmarkRequest2.getStartOffsetInclusive(), createBookmarkRequest2.getEndOffsetExclusive(), createBookmarkRequest2.getText(), time2, time2, createBookmarkRequest2.getNote(), BookmarkEntity.SyncState.PENDING_CREATE, str2, num22, d13, d12));
        this.logger.log(this.tag, "Bookmark created locally, enqueueing sync worker");
        BookmarkSyncWorker.INSTANCE.enqueue(this.appContext);
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteBookmark(String str, String str2, wn.c<? super z> cVar) {
        ReadBookmarkServiceImpl$deleteBookmark$1 readBookmarkServiceImpl$deleteBookmark$1;
        int i10;
        BookmarkEntity bookmarkEntity;
        if (cVar instanceof ReadBookmarkServiceImpl$deleteBookmark$1) {
            readBookmarkServiceImpl$deleteBookmark$1 = (ReadBookmarkServiceImpl$deleteBookmark$1) cVar;
            int i11 = readBookmarkServiceImpl$deleteBookmark$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$deleteBookmark$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$deleteBookmark$1.result;
                i10 = readBookmarkServiceImpl$deleteBookmark$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ir.i byId = this.bookmarksDao.getById(str2);
                    readBookmarkServiceImpl$deleteBookmark$1.L$0 = null;
                    readBookmarkServiceImpl$deleteBookmark$1.L$1 = null;
                    readBookmarkServiceImpl$deleteBookmark$1.label = 1;
                    obj = r.u(byId, readBookmarkServiceImpl$deleteBookmark$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                bookmarkEntity = (BookmarkEntity) obj;
                if (bookmarkEntity != null) {
                    this.bookmarksDao.update(BookmarkEntity.copy$default(bookmarkEntity, null, null, 0L, 0L, null, 0L, 0L, null, BookmarkEntity.SyncState.PENDING_DELETE, null, null, null, null, 7935, null));
                    this.logger.log(this.tag, "Bookmark marked for deletion, enqueueing sync worker");
                    BookmarkSyncWorker.INSTANCE.enqueue(this.appContext);
                }
                return z.f31622a;
            }
        }
        readBookmarkServiceImpl$deleteBookmark$1 = new ReadBookmarkServiceImpl$deleteBookmark$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$deleteBookmark$1.result;
        i10 = readBookmarkServiceImpl$deleteBookmark$1.label;
        if (i10 == 0) {
        }
        bookmarkEntity = (BookmarkEntity) obj2;
        if (bookmarkEntity != null) {
        }
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object downloadBookmarksMarkdown(String str, wn.c<? super AsyncCallResult<String>> cVar) {
        ReadBookmarkServiceImpl$downloadBookmarksMarkdown$1 readBookmarkServiceImpl$downloadBookmarksMarkdown$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof ReadBookmarkServiceImpl$downloadBookmarksMarkdown$1) {
            readBookmarkServiceImpl$downloadBookmarksMarkdown$1 = (ReadBookmarkServiceImpl$downloadBookmarksMarkdown$1) cVar;
            int i11 = readBookmarkServiceImpl$downloadBookmarksMarkdown$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$downloadBookmarksMarkdown$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$downloadBookmarksMarkdown$1.result;
                i10 = readBookmarkServiceImpl$downloadBookmarksMarkdown$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReadBookmarksAPI readBookmarksAPI = this.api;
                    readBookmarkServiceImpl$downloadBookmarksMarkdown$1.L$0 = null;
                    readBookmarkServiceImpl$downloadBookmarksMarkdown$1.label = 1;
                    obj = readBookmarksAPI.downloadBookmarksMarkdown(str, readBookmarkServiceImpl$downloadBookmarksMarkdown$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return new AsyncCallResult.Success(((BookmarkMarkdownResponseModel) ((ApiResult.Success) apiResult).getData()).getMarkdown());
                }
                if (apiResult instanceof ApiResult.Error) {
                    return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), new b(21));
                }
                c6.p();
                return null;
            }
        }
        readBookmarkServiceImpl$downloadBookmarksMarkdown$1 = new ReadBookmarkServiceImpl$downloadBookmarksMarkdown$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$downloadBookmarksMarkdown$1.result;
        i10 = readBookmarkServiceImpl$downloadBookmarksMarkdown$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    public Object getBookmarkRanges(String str, wn.c<? super ir.i> cVar) {
        final ir.i offsets$default = BookmarksDao.getOffsets$default(this.bookmarksDao, str, null, 2, null);
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarkRanges$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarkRanges$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarkRanges$$inlined$map$1$2", f = "ReadBookmarkServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarkRanges$$inlined$map$1$2$1, reason: invalid class name */
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
                                List<BookmarksDao.BookmarkOffsetTuple> list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                for (BookmarksDao.BookmarkOffsetTuple bookmarkOffsetTuple : list) {
                                    arrayList.add(new BookmarkRange(bookmarkOffsetTuple.getId(), bookmarkOffsetTuple.getStartOffsetInclusive(), bookmarkOffsetTuple.getEndOffsetExclusive()));
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
    }

    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    public Object getBookmarks(String str, wn.c<? super ir.i> cVar) {
        final ir.i all$default = BookmarksDao.getAll$default(this.bookmarksDao, str, null, 2, null);
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarks$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarks$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ ReadBookmarkServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarks$$inlined$map$1$2", f = "ReadBookmarkServiceImpl.kt", l = {51, 50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$getBookmarks$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    int I$1;
                    int I$2;
                    int I$3;
                    int I$4;
                    Object L$0;
                    Object L$1;
                    Object L$10;
                    Object L$11;
                    Object L$12;
                    Object L$13;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    Object L$7;
                    Object L$8;
                    Object L$9;
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

                public AnonymousClass2(ir.j jVar, ReadBookmarkServiceImpl readBookmarkServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = readBookmarkServiceImpl;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x00fc, code lost:
                
                    if (r10.emit((java.util.List) r7, r0) == r11) goto L26;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ce -> B:17:0x00cf). Please report as a decompilation issue!!! */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Iterator<T> it;
                    ir.j jVar;
                    Collection collection;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    boolean hasNext;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i15 = anonymousClass1.label;
                        if ((i15 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i15 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        sn.a.g(obj2);
                                        return z.f31622a;
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i11 = anonymousClass1.I$3;
                                i12 = anonymousClass1.I$2;
                                i13 = anonymousClass1.I$1;
                                i14 = anonymousClass1.I$0;
                                collection = (Collection) anonymousClass1.L$13;
                                it = (Iterator) anonymousClass1.L$10;
                                Collection collection2 = (Collection) anonymousClass1.L$9;
                                jVar = (ir.j) anonymousClass1.L$4;
                                sn.a.g(obj2);
                                collection.add((Bookmark) obj2);
                                collection = collection2;
                                hasNext = it.hasNext();
                                xn.a aVar = xn.a.f37986a;
                                if (hasNext) {
                                    BookmarkEntity bookmarkEntity = (BookmarkEntity) it.next();
                                    ReadBookmarkServiceImpl readBookmarkServiceImpl = this.this$0;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = jVar;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.L$6 = null;
                                    anonymousClass1.L$7 = null;
                                    anonymousClass1.L$8 = null;
                                    anonymousClass1.L$9 = collection;
                                    anonymousClass1.L$10 = it;
                                    anonymousClass1.L$11 = null;
                                    anonymousClass1.L$12 = null;
                                    anonymousClass1.L$13 = collection;
                                    anonymousClass1.I$0 = i14;
                                    anonymousClass1.I$1 = i13;
                                    anonymousClass1.I$2 = i12;
                                    anonymousClass1.I$3 = i11;
                                    anonymousClass1.I$4 = 0;
                                    anonymousClass1.label = 1;
                                    obj2 = readBookmarkServiceImpl.toDomain(bookmarkEntity, anonymousClass1);
                                    if (obj2 != aVar) {
                                        collection2 = collection;
                                        collection.add((Bookmark) obj2);
                                        collection = collection2;
                                        hasNext = it.hasNext();
                                        xn.a aVar2 = xn.a.f37986a;
                                        if (hasNext) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.L$5 = null;
                                            anonymousClass1.L$6 = null;
                                            anonymousClass1.L$7 = null;
                                            anonymousClass1.L$8 = null;
                                            anonymousClass1.L$9 = null;
                                            anonymousClass1.L$10 = null;
                                            anonymousClass1.L$11 = null;
                                            anonymousClass1.L$12 = null;
                                            anonymousClass1.L$13 = null;
                                            anonymousClass1.I$0 = i14;
                                            anonymousClass1.label = 2;
                                        }
                                    }
                                }
                                return aVar2;
                            }
                            sn.a.g(obj2);
                            ir.j jVar2 = this.$this_unsafeFlow;
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(p.a0(list, 10));
                            it = list.iterator();
                            jVar = jVar2;
                            collection = arrayList;
                            i11 = 0;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                            hasNext = it.hasNext();
                            xn.a aVar22 = xn.a.f37986a;
                            if (hasNext) {
                            }
                            return aVar22;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    public Object observeBookmark(String str, wn.c<? super ir.i> cVar) {
        final ir.i byId = this.bookmarksDao.getById(str);
        return new ir.i() { // from class: io.elevenlabs.data.services.ReadBookmarkServiceImpl$observeBookmark$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$observeBookmark$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ ReadBookmarkServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$observeBookmark$$inlined$map$1$2", f = "ReadBookmarkServiceImpl.kt", l = {51, 50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$observeBookmark$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(ir.j jVar, ReadBookmarkServiceImpl readBookmarkServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = readBookmarkServiceImpl;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
                
                    if (r1.emit(r10, r0) == r5) goto L26;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
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
                    Bookmark bookmark;
                    Object domain;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i12 - Integer.MIN_VALUE;
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
                                i11 = anonymousClass1.I$0;
                                jVar = (ir.j) anonymousClass1.L$4;
                                sn.a.g(obj2);
                            } else {
                                sn.a.g(obj2);
                                jVar = this.$this_unsafeFlow;
                                BookmarkEntity bookmarkEntity = (BookmarkEntity) obj;
                                if (bookmarkEntity != null) {
                                    ReadBookmarkServiceImpl readBookmarkServiceImpl = this.this$0;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = jVar;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.L$6 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.I$1 = 0;
                                    anonymousClass1.label = 1;
                                    domain = readBookmarkServiceImpl.toDomain(bookmarkEntity, anonymousClass1);
                                    if (domain != aVar) {
                                        obj2 = domain;
                                        i11 = 0;
                                    }
                                    return aVar;
                                }
                                i11 = 0;
                                bookmark = null;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.I$0 = i11;
                                anonymousClass1.label = 2;
                            }
                            bookmark = (Bookmark) obj2;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.I$0 = i11;
                            anonymousClass1.label = 2;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    xn.a aVar2 = xn.a.f37986a;
                    if (i10 == 0) {
                    }
                    bookmark = (Bookmark) obj22;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.L$6 = null;
                    anonymousClass1.I$0 = i11;
                    anonymousClass1.label = 2;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0117, code lost:
    
        if (r12 != r7) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:13:0x0044, B:14:0x011a, B:16:0x0120, B:19:0x012b, B:24:0x0068, B:25:0x00c1, B:27:0x00c5, B:29:0x00cd, B:30:0x00d2, B:34:0x0075, B:35:0x0090, B:37:0x0094, B:39:0x009c, B:41:0x00ab, B:46:0x007c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:13:0x0044, B:14:0x011a, B:16:0x0120, B:19:0x012b, B:24:0x0068, B:25:0x00c1, B:27:0x00c5, B:29:0x00cd, B:30:0x00d2, B:34:0x0075, B:35:0x0090, B:37:0x0094, B:39:0x009c, B:41:0x00ab, B:46:0x007c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:13:0x0044, B:14:0x011a, B:16:0x0120, B:19:0x012b, B:24:0x0068, B:25:0x00c1, B:27:0x00c5, B:29:0x00cd, B:30:0x00d2, B:34:0x0075, B:35:0x0090, B:37:0x0094, B:39:0x009c, B:41:0x00ab, B:46:0x007c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:13:0x0044, B:14:0x011a, B:16:0x0120, B:19:0x012b, B:24:0x0068, B:25:0x00c1, B:27:0x00c5, B:29:0x00cd, B:30:0x00d2, B:34:0x0075, B:35:0x0090, B:37:0x0094, B:39:0x009c, B:41:0x00ab, B:46:0x007c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shareBookmark(String str, String str2, wn.c<? super AsyncCallResult<BookmarkShareResult>> cVar) {
        ReadBookmarkServiceImpl$shareBookmark$1 readBookmarkServiceImpl$shareBookmark$1;
        int i10;
        BookmarkEntity bookmarkEntity;
        kotlin.jvm.internal.d0 d0Var;
        String str3;
        kotlin.jvm.internal.d0 d0Var2;
        kotlin.jvm.internal.d0 d0Var3;
        File file;
        String str4;
        try {
            if (cVar instanceof ReadBookmarkServiceImpl$shareBookmark$1) {
                readBookmarkServiceImpl$shareBookmark$1 = (ReadBookmarkServiceImpl$shareBookmark$1) cVar;
                int i11 = readBookmarkServiceImpl$shareBookmark$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    readBookmarkServiceImpl$shareBookmark$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = readBookmarkServiceImpl$shareBookmark$1.result;
                    i10 = readBookmarkServiceImpl$shareBookmark$1.label;
                    Object obj2 = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    file = (File) readBookmarkServiceImpl$shareBookmark$1.L$4;
                                    sn.a.g(obj);
                                    if (((FileDownloadState) obj) instanceof FileDownloadState.Finished) {
                                        return new AsyncCallResult.Success(new BookmarkShareResult(file));
                                    }
                                    return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d0Var = (kotlin.jvm.internal.d0) readBookmarkServiceImpl$shareBookmark$1.L$4;
                            d0Var2 = (kotlin.jvm.internal.d0) readBookmarkServiceImpl$shareBookmark$1.L$3;
                            str3 = (String) readBookmarkServiceImpl$shareBookmark$1.L$1;
                            sn.a.g(obj);
                            str4 = (String) obj;
                            if (str4 != null) {
                                return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
                            }
                            d0Var.f20559a = str4;
                            String str5 = str3;
                            d0Var3 = d0Var2;
                            str2 = str5;
                            file = new File(this.fileService.getCacheDirectory(), "shared/bookmark_" + d0Var3.f20559a + "_voice_" + str2 + ".mp4");
                            ir.i downloadFile = FileDownloadExtensionKt.downloadFile(file, JsonKt.getJson(), new ReadBookmarkServiceImpl$shareBookmark$flow$1(this, d0Var3, str2, null));
                            readBookmarkServiceImpl$shareBookmark$1.L$0 = null;
                            readBookmarkServiceImpl$shareBookmark$1.L$1 = null;
                            readBookmarkServiceImpl$shareBookmark$1.L$2 = null;
                            readBookmarkServiceImpl$shareBookmark$1.L$3 = null;
                            readBookmarkServiceImpl$shareBookmark$1.L$4 = file;
                            readBookmarkServiceImpl$shareBookmark$1.L$5 = null;
                            readBookmarkServiceImpl$shareBookmark$1.label = 3;
                            obj = r.A(downloadFile, readBookmarkServiceImpl$shareBookmark$1);
                        } else {
                            str2 = (String) readBookmarkServiceImpl$shareBookmark$1.L$1;
                            str = (String) readBookmarkServiceImpl$shareBookmark$1.L$0;
                            sn.a.g(obj);
                        }
                    } else {
                        sn.a.g(obj);
                        ir.i byId = this.bookmarksDao.getById(str);
                        readBookmarkServiceImpl$shareBookmark$1.L$0 = str;
                        readBookmarkServiceImpl$shareBookmark$1.L$1 = str2;
                        readBookmarkServiceImpl$shareBookmark$1.label = 1;
                        obj = r.u(byId, readBookmarkServiceImpl$shareBookmark$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    bookmarkEntity = (BookmarkEntity) obj;
                    if (bookmarkEntity != null) {
                        return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
                    }
                    ?? obj3 = new Object();
                    obj3.f20559a = str;
                    d0Var3 = obj3;
                    if (bookmarkEntity.getSync_state() == BookmarkEntity.SyncState.PENDING_CREATE) {
                        readBookmarkServiceImpl$shareBookmark$1.L$0 = null;
                        readBookmarkServiceImpl$shareBookmark$1.L$1 = str2;
                        readBookmarkServiceImpl$shareBookmark$1.L$2 = null;
                        readBookmarkServiceImpl$shareBookmark$1.L$3 = obj3;
                        readBookmarkServiceImpl$shareBookmark$1.L$4 = obj3;
                        readBookmarkServiceImpl$shareBookmark$1.label = 2;
                        obj = syncPendingCreateBookmark(bookmarkEntity, readBookmarkServiceImpl$shareBookmark$1);
                        if (obj != obj2) {
                            d0Var = obj3;
                            str3 = str2;
                            d0Var2 = d0Var;
                            str4 = (String) obj;
                            if (str4 != null) {
                            }
                        } else {
                            return obj2;
                        }
                    }
                    file = new File(this.fileService.getCacheDirectory(), "shared/bookmark_" + d0Var3.f20559a + "_voice_" + str2 + ".mp4");
                    ir.i downloadFile2 = FileDownloadExtensionKt.downloadFile(file, JsonKt.getJson(), new ReadBookmarkServiceImpl$shareBookmark$flow$1(this, d0Var3, str2, null));
                    readBookmarkServiceImpl$shareBookmark$1.L$0 = null;
                    readBookmarkServiceImpl$shareBookmark$1.L$1 = null;
                    readBookmarkServiceImpl$shareBookmark$1.L$2 = null;
                    readBookmarkServiceImpl$shareBookmark$1.L$3 = null;
                    readBookmarkServiceImpl$shareBookmark$1.L$4 = file;
                    readBookmarkServiceImpl$shareBookmark$1.L$5 = null;
                    readBookmarkServiceImpl$shareBookmark$1.label = 3;
                    obj = r.A(downloadFile2, readBookmarkServiceImpl$shareBookmark$1);
                }
            }
            if (i10 == 0) {
            }
            bookmarkEntity = (BookmarkEntity) obj;
            if (bookmarkEntity != null) {
            }
        } catch (Exception e10) {
            Logger.logWarning$default(this.logger, this.tag, defpackage.f.i("Failed to share bookmark: ", e10.getMessage()), null, 4, null);
            return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
        }
        readBookmarkServiceImpl$shareBookmark$1 = new ReadBookmarkServiceImpl$shareBookmark$1(this, cVar);
        Object obj4 = readBookmarkServiceImpl$shareBookmark$1.result;
        i10 = readBookmarkServiceImpl$shareBookmark$1.label;
        Object obj22 = xn.a.f37986a;
    }

    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    public Object sync(String str, wn.c<? super ir.i> cVar) {
        e0 e0Var;
        ir.e j4 = r.j(new ReadBookmarkServiceImpl$sync$2(this, str, null));
        kr.d F = g0.F(this.coroutineScope, this.dispatcherFactory.getDefault());
        y1 y1Var = new y1(2000L, Long.MAX_VALUE);
        n m10 = r.m(j4, 0);
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

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e8, code lost:
    
        if (r5 == r12) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ee, code lost:
    
        if (r2 == r12) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0209 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:15:0x0053, B:17:0x01eb, B:21:0x0209, B:25:0x0169, B:31:0x0187, B:33:0x018f, B:36:0x01a8, B:38:0x01b0, B:41:0x01c9, B:43:0x01d1, B:51:0x0227, B:52:0x022c, B:59:0x0081, B:61:0x00a5, B:63:0x00c7), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:15:0x0053, B:17:0x01eb, B:21:0x0209, B:25:0x0169, B:31:0x0187, B:33:0x018f, B:36:0x01a8, B:38:0x01b0, B:41:0x01c9, B:43:0x01d1, B:51:0x0227, B:52:0x022c, B:59:0x0081, B:61:0x00a5, B:63:0x00c7), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:15:0x0053, B:17:0x01eb, B:21:0x0209, B:25:0x0169, B:31:0x0187, B:33:0x018f, B:36:0x01a8, B:38:0x01b0, B:41:0x01c9, B:43:0x01d1, B:51:0x0227, B:52:0x022c, B:59:0x0081, B:61:0x00a5, B:63:0x00c7), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d1 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:15:0x0053, B:17:0x01eb, B:21:0x0209, B:25:0x0169, B:31:0x0187, B:33:0x018f, B:36:0x01a8, B:38:0x01b0, B:41:0x01c9, B:43:0x01d1, B:51:0x0227, B:52:0x022c, B:59:0x0081, B:61:0x00a5, B:63:0x00c7), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:15:0x0053, B:17:0x01eb, B:21:0x0209, B:25:0x0169, B:31:0x0187, B:33:0x018f, B:36:0x01a8, B:38:0x01b0, B:41:0x01c9, B:43:0x01d1, B:51:0x0227, B:52:0x022c, B:59:0x0081, B:61:0x00a5, B:63:0x00c7), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01e8 -> B:17:0x01eb). Please report as a decompilation issue!!! */
    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncAllPending(int i10, wn.c<? super Integer> cVar) {
        ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$1;
        int i11;
        List list;
        List b12;
        int size;
        Iterator it;
        List list2;
        Iterator it2;
        String str;
        int i12;
        int i13;
        List list3;
        int i14;
        ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$12;
        boolean z6;
        Iterator it3;
        int i15 = i10;
        try {
            if (cVar instanceof ReadBookmarkServiceImpl$syncAllPending$1) {
                readBookmarkServiceImpl$syncAllPending$1 = (ReadBookmarkServiceImpl$syncAllPending$1) cVar;
                int i16 = readBookmarkServiceImpl$syncAllPending$1.label;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    readBookmarkServiceImpl$syncAllPending$1.label = i16 - Integer.MIN_VALUE;
                    Object obj = readBookmarkServiceImpl$syncAllPending$1.result;
                    i11 = readBookmarkServiceImpl$syncAllPending$1.label;
                    int i17 = 4;
                    Object obj2 = xn.a.f37986a;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        if (i11 == 5) {
                                            i13 = readBookmarkServiceImpl$syncAllPending$1.I$1;
                                            i12 = readBookmarkServiceImpl$syncAllPending$1.I$0;
                                            str = (String) readBookmarkServiceImpl$syncAllPending$1.L$4;
                                            it2 = (Iterator) readBookmarkServiceImpl$syncAllPending$1.L$3;
                                            list2 = (List) readBookmarkServiceImpl$syncAllPending$1.L$1;
                                            sn.a.g(obj);
                                            Object syncRemoteChanges = obj;
                                            if (((Boolean) syncRemoteChanges).booleanValue()) {
                                                ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$13 = readBookmarkServiceImpl$syncAllPending$1;
                                                i14 = i13;
                                                i15 = i12;
                                                readBookmarkServiceImpl$syncAllPending$12 = readBookmarkServiceImpl$syncAllPending$13;
                                                z6 = true;
                                                it = it2;
                                                list3 = list2;
                                                if (z6) {
                                                    this.logger.log(this.tag, "Successfully synced bookmarks for read: " + str);
                                                    size = i14;
                                                    readBookmarkServiceImpl$syncAllPending$1 = readBookmarkServiceImpl$syncAllPending$12;
                                                    b12 = list3;
                                                    i17 = 4;
                                                    if (!it.hasNext()) {
                                                        Map.Entry entry = (Map.Entry) it.next();
                                                        str = (String) entry.getKey();
                                                        readBookmarkServiceImpl$syncAllPending$1.L$0 = null;
                                                        readBookmarkServiceImpl$syncAllPending$1.L$1 = b12;
                                                        readBookmarkServiceImpl$syncAllPending$1.L$2 = null;
                                                        readBookmarkServiceImpl$syncAllPending$1.L$3 = it;
                                                        readBookmarkServiceImpl$syncAllPending$1.L$4 = str;
                                                        readBookmarkServiceImpl$syncAllPending$1.L$5 = null;
                                                        readBookmarkServiceImpl$syncAllPending$1.I$0 = i15;
                                                        readBookmarkServiceImpl$syncAllPending$1.I$1 = size;
                                                        readBookmarkServiceImpl$syncAllPending$1.label = 2;
                                                        Object syncPendingCreates = syncPendingCreates(str, readBookmarkServiceImpl$syncAllPending$1);
                                                        if (syncPendingCreates != obj2) {
                                                            list3 = b12;
                                                            i12 = i15;
                                                            i13 = size;
                                                            obj = syncPendingCreates;
                                                            it3 = it;
                                                            if (((Boolean) obj).booleanValue()) {
                                                                readBookmarkServiceImpl$syncAllPending$1.L$0 = null;
                                                                readBookmarkServiceImpl$syncAllPending$1.L$1 = list3;
                                                                readBookmarkServiceImpl$syncAllPending$1.L$2 = null;
                                                                readBookmarkServiceImpl$syncAllPending$1.L$3 = it3;
                                                                readBookmarkServiceImpl$syncAllPending$1.L$4 = str;
                                                                readBookmarkServiceImpl$syncAllPending$1.L$5 = null;
                                                                readBookmarkServiceImpl$syncAllPending$1.I$0 = i12;
                                                                readBookmarkServiceImpl$syncAllPending$1.I$1 = i13;
                                                                readBookmarkServiceImpl$syncAllPending$1.label = 3;
                                                                obj = syncPendingDeletes(str, readBookmarkServiceImpl$syncAllPending$1);
                                                                if (obj == obj2) {
                                                                    return obj2;
                                                                }
                                                                if (((Boolean) obj).booleanValue()) {
                                                                    readBookmarkServiceImpl$syncAllPending$1.L$0 = null;
                                                                    readBookmarkServiceImpl$syncAllPending$1.L$1 = list3;
                                                                    readBookmarkServiceImpl$syncAllPending$1.L$2 = null;
                                                                    readBookmarkServiceImpl$syncAllPending$1.L$3 = it3;
                                                                    readBookmarkServiceImpl$syncAllPending$1.L$4 = str;
                                                                    readBookmarkServiceImpl$syncAllPending$1.L$5 = null;
                                                                    readBookmarkServiceImpl$syncAllPending$1.I$0 = i12;
                                                                    readBookmarkServiceImpl$syncAllPending$1.I$1 = i13;
                                                                    readBookmarkServiceImpl$syncAllPending$1.label = i17;
                                                                    obj = syncPendingUpdates(str, readBookmarkServiceImpl$syncAllPending$1);
                                                                    if (obj == obj2) {
                                                                        return obj2;
                                                                    }
                                                                    list2 = list3;
                                                                    it2 = it3;
                                                                    if (!((Boolean) obj).booleanValue()) {
                                                                        readBookmarkServiceImpl$syncAllPending$1.L$0 = null;
                                                                        readBookmarkServiceImpl$syncAllPending$1.L$1 = list2;
                                                                        readBookmarkServiceImpl$syncAllPending$1.L$2 = null;
                                                                        readBookmarkServiceImpl$syncAllPending$1.L$3 = it2;
                                                                        readBookmarkServiceImpl$syncAllPending$1.L$4 = str;
                                                                        readBookmarkServiceImpl$syncAllPending$1.L$5 = null;
                                                                        readBookmarkServiceImpl$syncAllPending$1.I$0 = i12;
                                                                        readBookmarkServiceImpl$syncAllPending$1.I$1 = i13;
                                                                        readBookmarkServiceImpl$syncAllPending$1.label = 5;
                                                                        syncRemoteChanges = syncRemoteChanges(str, readBookmarkServiceImpl$syncAllPending$1);
                                                                    }
                                                                }
                                                            }
                                                            ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$14 = readBookmarkServiceImpl$syncAllPending$1;
                                                            i14 = i13;
                                                            i15 = i12;
                                                            readBookmarkServiceImpl$syncAllPending$12 = readBookmarkServiceImpl$syncAllPending$14;
                                                            it = it3;
                                                            z6 = false;
                                                            if (z6) {
                                                                throw new BookmarkSyncException();
                                                            }
                                                        } else {
                                                            return obj2;
                                                        }
                                                    } else {
                                                        this.logger.log(this.tag, "Successfully processed " + b12.size() + " bookmarks");
                                                        return new Integer(size);
                                                    }
                                                }
                                            }
                                            Iterator it4 = it2;
                                            list3 = list2;
                                            ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$15 = readBookmarkServiceImpl$syncAllPending$1;
                                            i14 = i13;
                                            i15 = i12;
                                            readBookmarkServiceImpl$syncAllPending$12 = readBookmarkServiceImpl$syncAllPending$15;
                                            it = it4;
                                            z6 = false;
                                            if (z6) {
                                            }
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        i13 = readBookmarkServiceImpl$syncAllPending$1.I$1;
                                        i12 = readBookmarkServiceImpl$syncAllPending$1.I$0;
                                        str = (String) readBookmarkServiceImpl$syncAllPending$1.L$4;
                                        it3 = (Iterator) readBookmarkServiceImpl$syncAllPending$1.L$3;
                                        list3 = (List) readBookmarkServiceImpl$syncAllPending$1.L$1;
                                        sn.a.g(obj);
                                        list2 = list3;
                                        it2 = it3;
                                        if (!((Boolean) obj).booleanValue()) {
                                        }
                                    }
                                } else {
                                    i13 = readBookmarkServiceImpl$syncAllPending$1.I$1;
                                    i12 = readBookmarkServiceImpl$syncAllPending$1.I$0;
                                    str = (String) readBookmarkServiceImpl$syncAllPending$1.L$4;
                                    it3 = (Iterator) readBookmarkServiceImpl$syncAllPending$1.L$3;
                                    list3 = (List) readBookmarkServiceImpl$syncAllPending$1.L$1;
                                    sn.a.g(obj);
                                    if (((Boolean) obj).booleanValue()) {
                                    }
                                    ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$142 = readBookmarkServiceImpl$syncAllPending$1;
                                    i14 = i13;
                                    i15 = i12;
                                    readBookmarkServiceImpl$syncAllPending$12 = readBookmarkServiceImpl$syncAllPending$142;
                                    it = it3;
                                    z6 = false;
                                    if (z6) {
                                    }
                                }
                            } else {
                                i13 = readBookmarkServiceImpl$syncAllPending$1.I$1;
                                i12 = readBookmarkServiceImpl$syncAllPending$1.I$0;
                                str = (String) readBookmarkServiceImpl$syncAllPending$1.L$4;
                                it3 = (Iterator) readBookmarkServiceImpl$syncAllPending$1.L$3;
                                list3 = (List) readBookmarkServiceImpl$syncAllPending$1.L$1;
                                sn.a.g(obj);
                                if (((Boolean) obj).booleanValue()) {
                                }
                                ReadBookmarkServiceImpl$syncAllPending$1 readBookmarkServiceImpl$syncAllPending$1422 = readBookmarkServiceImpl$syncAllPending$1;
                                i14 = i13;
                                i15 = i12;
                                readBookmarkServiceImpl$syncAllPending$12 = readBookmarkServiceImpl$syncAllPending$1422;
                                it = it3;
                                z6 = false;
                                if (z6) {
                                }
                            }
                        } else {
                            i15 = readBookmarkServiceImpl$syncAllPending$1.I$0;
                            sn.a.g(obj);
                        }
                    } else {
                        sn.a.g(obj);
                        ib.i.q("Starting to sync up to ", i15, " pending bookmark changes", this.logger, this.tag);
                        ir.i allWithPendingSyncState = this.bookmarksDao.getAllWithPendingSyncState();
                        readBookmarkServiceImpl$syncAllPending$1.I$0 = i15;
                        readBookmarkServiceImpl$syncAllPending$1.label = 1;
                        obj = r.u(allWithPendingSyncState, readBookmarkServiceImpl$syncAllPending$1);
                    }
                    list = (List) obj;
                    if (!list.isEmpty()) {
                        this.logger.log(this.tag, "No pending bookmark changes found");
                        return new Integer(0);
                    }
                    b12 = o.b1(list, i15);
                    size = list.size() - b12.size();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : b12) {
                        String read_id = ((BookmarkEntity) obj3).getRead_id();
                        Object obj4 = linkedHashMap.get(read_id);
                        if (obj4 == null) {
                            ArrayList arrayList = new ArrayList();
                            linkedHashMap.put(read_id, arrayList);
                            obj4 = arrayList;
                        }
                        ((List) obj4).add(obj3);
                    }
                    it = linkedHashMap.entrySet().iterator();
                    if (!it.hasNext()) {
                    }
                }
            }
            if (i11 == 0) {
            }
            list = (List) obj;
            if (!list.isEmpty()) {
            }
        } catch (Exception e10) {
            Logger.logWarning$default(this.logger, this.tag, defpackage.f.k("Failed to sync bookmarks for read ", str, ": ", e10.getMessage()), null, 4, null);
            throw new BookmarkSyncException();
        }
        readBookmarkServiceImpl$syncAllPending$1 = new ReadBookmarkServiceImpl$syncAllPending$1(this, cVar);
        Object obj5 = readBookmarkServiceImpl$syncAllPending$1.result;
        i11 = readBookmarkServiceImpl$syncAllPending$1.label;
        int i172 = 4;
        Object obj22 = xn.a.f37986a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r1 == r7) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // io.elevenlabs.domain.services.ReadBookmarkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateBookmark(String str, String str2, String str3, wn.c<? super z> cVar) {
        ReadBookmarkServiceImpl$updateBookmark$1 readBookmarkServiceImpl$updateBookmark$1;
        int i10;
        String str4;
        BookmarkEntity bookmarkEntity;
        BookmarkEntity bookmarkEntity2;
        String str5;
        BookmarkEntity.SyncState syncState;
        if (cVar instanceof ReadBookmarkServiceImpl$updateBookmark$1) {
            readBookmarkServiceImpl$updateBookmark$1 = (ReadBookmarkServiceImpl$updateBookmark$1) cVar;
            int i11 = readBookmarkServiceImpl$updateBookmark$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readBookmarkServiceImpl$updateBookmark$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readBookmarkServiceImpl$updateBookmark$1.result;
                i10 = readBookmarkServiceImpl$updateBookmark$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            BookmarkEntity bookmarkEntity3 = (BookmarkEntity) readBookmarkServiceImpl$updateBookmark$1.L$3;
                            String str6 = (String) readBookmarkServiceImpl$updateBookmark$1.L$2;
                            sn.a.g(obj);
                            bookmarkEntity2 = bookmarkEntity3;
                            str5 = str6;
                            long time = ((Date) obj).getTime();
                            if (WhenMappings.$EnumSwitchMapping$0[bookmarkEntity2.getSync_state().ordinal()] != 1) {
                                syncState = BookmarkEntity.SyncState.PENDING_CREATE;
                            } else {
                                syncState = BookmarkEntity.SyncState.PENDING_UPDATE_PUSH;
                            }
                            this.bookmarksDao.update(BookmarkEntity.copy$default(bookmarkEntity2, null, null, 0L, 0L, null, 0L, time, str5, syncState, null, null, null, null, 7743, null));
                            this.logger.log(this.tag, "Bookmark updated, enqueueing sync worker");
                            BookmarkSyncWorker.INSTANCE.enqueue(this.appContext);
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) readBookmarkServiceImpl$updateBookmark$1.L$2;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ir.i byId = this.bookmarksDao.getById(str2);
                    readBookmarkServiceImpl$updateBookmark$1.L$0 = null;
                    readBookmarkServiceImpl$updateBookmark$1.L$1 = null;
                    str4 = str3;
                    readBookmarkServiceImpl$updateBookmark$1.L$2 = str4;
                    readBookmarkServiceImpl$updateBookmark$1.label = 1;
                    obj = r.u(byId, readBookmarkServiceImpl$updateBookmark$1);
                }
                bookmarkEntity = (BookmarkEntity) obj;
                if (bookmarkEntity != null) {
                    ir.i m958invokeLRDsOJo$default = GetCurrentTimeUseCase.m958invokeLRDsOJo$default(this.currentTimeUseCase, 0L, 1, null);
                    readBookmarkServiceImpl$updateBookmark$1.L$0 = null;
                    readBookmarkServiceImpl$updateBookmark$1.L$1 = null;
                    readBookmarkServiceImpl$updateBookmark$1.L$2 = str4;
                    readBookmarkServiceImpl$updateBookmark$1.L$3 = bookmarkEntity;
                    readBookmarkServiceImpl$updateBookmark$1.I$0 = 0;
                    readBookmarkServiceImpl$updateBookmark$1.label = 2;
                    Object u6 = r.u(m958invokeLRDsOJo$default, readBookmarkServiceImpl$updateBookmark$1);
                    if (u6 != aVar) {
                        bookmarkEntity2 = bookmarkEntity;
                        obj = u6;
                        str5 = str4;
                        long time2 = ((Date) obj).getTime();
                        if (WhenMappings.$EnumSwitchMapping$0[bookmarkEntity2.getSync_state().ordinal()] != 1) {
                        }
                        this.bookmarksDao.update(BookmarkEntity.copy$default(bookmarkEntity2, null, null, 0L, 0L, null, 0L, time2, str5, syncState, null, null, null, null, 7743, null));
                        this.logger.log(this.tag, "Bookmark updated, enqueueing sync worker");
                        BookmarkSyncWorker.INSTANCE.enqueue(this.appContext);
                    }
                    return aVar;
                }
                return z.f31622a;
            }
        }
        readBookmarkServiceImpl$updateBookmark$1 = new ReadBookmarkServiceImpl$updateBookmark$1(this, cVar);
        Object obj2 = readBookmarkServiceImpl$updateBookmark$1.result;
        i10 = readBookmarkServiceImpl$updateBookmark$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        bookmarkEntity = (BookmarkEntity) obj2;
        if (bookmarkEntity != null) {
        }
        return z.f31622a;
    }
}
