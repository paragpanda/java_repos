/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rekognition;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;

/**
 * Interface for accessing Amazon Rekognition asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rekognition.AbstractAmazonRekognitionAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the Amazon Rekognition API reference.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRekognitionAsync extends AmazonRekognition {

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100 largest faces detected in the <i>target</i>
     * input image.
     * </p>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and compares it with each face
     * detected in the target image.
     * </p>
     * <note>
     * <p>
     * CompareFaces uses machine learning algorithms, which are probabilistic. A false negative is an incorrect
     * prediction that a face in the target image has a low similarity confidence score when compared to the face in the
     * source image. To reduce the probability of false negatives, we recommend that you compare the target image
     * against multiple source images. If you plan to use <code>CompareFaces</code> to make a decision that impacts an
     * individual's rights, privacy, or access to services, we recommend that you pass the result to a human for review
     * and further validation before taking action.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon
     * S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score in descending order. For
     * each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role,
     * and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the
     * bounding box contains a face). The response also provides a similarity score, which indicates how closely the
     * faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You
     * can change this value by specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match the source image. For each face, it
     * returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding box of the face and confidence value.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. Use <code>QualityFilter</code> to set the
     * quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do not want to
     * filter detected faces, specify <code>NONE</code>. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code> returns orientation information for the
     * source and target images. Use these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images, <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @return A Java Future containing the result of the CompareFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.CompareFaces
     */
    java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest compareFacesRequest);

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100 largest faces detected in the <i>target</i>
     * input image.
     * </p>
     * <p>
     * If the source image contains multiple faces, the service detects the largest face and compares it with each face
     * detected in the target image.
     * </p>
     * <note>
     * <p>
     * CompareFaces uses machine learning algorithms, which are probabilistic. A false negative is an incorrect
     * prediction that a face in the target image has a low similarity confidence score when compared to the face in the
     * source image. To reduce the probability of false negatives, we recommend that you compare the target image
     * against multiple source images. If you plan to use <code>CompareFaces</code> to make a decision that impacts an
     * individual's rights, privacy, or access to services, we recommend that you pass the result to a human for review
     * and further validation before taking action.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon
     * S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by similarity score in descending order. For
     * each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role,
     * and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the
     * bounding box contains a face). The response also provides a similarity score, which indicates how closely the
     * faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You
     * can change this value by specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match the source image. For each face, it
     * returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding box of the face and confidence value.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. Use <code>QualityFilter</code> to set the
     * quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do not want to
     * filter detected faces, specify <code>NONE</code>. The default value is <code>NONE</code>.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code> returns orientation information for the
     * source and target images. Use these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images, <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompareFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CompareFaces
     */
    java.util.concurrent.Future<CompareFacesResult> compareFacesAsync(CompareFacesRequest compareFacesRequest,
            com.amazonaws.handlers.AsyncHandler<CompareFacesRequest, CompareFacesResult> asyncHandler);

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the collection using the <a>IndexFaces</a> operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <p>
     * When you create a collection, it is associated with the latest version of the face model version.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action. If you want
     * to tag your collection, you also require permission to perform the <code>rekognition:TagResource</code>
     * operation.
     * </p>
     * 
     * @param createCollectionRequest
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateCollection
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest);

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the collection using the <a>IndexFaces</a> operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your application users. A user can then index faces
     * using the <code>IndexFaces</code> operation and persist results in a specific collection. Then, a user can search
     * the collection for faces in the user-specific container.
     * </p>
     * <p>
     * When you create a collection, it is associated with the latest version of the face model version.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateCollection</code> action. If you want
     * to tag your collection, you also require permission to perform the <code>rekognition:TagResource</code>
     * operation.
     * </p>
     * 
     * @param createCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateCollection
     */
    java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest createCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Rekognition Custom Labels dataset. You can create a dataset by using an Amazon Sagemaker
     * format manifest file or by copying an existing Amazon Rekognition Custom Labels dataset.
     * </p>
     * <p>
     * To create a training dataset for a project, specify <code>train</code> for the value of <code>DatasetType</code>.
     * To create the test dataset for a project, specify <code>test</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * The response from <code>CreateDataset</code> is the Amazon Resource Name (ARN) for the dataset. Creating a
     * dataset takes a while to complete. Use <a>DescribeDataset</a> to check the current status. The dataset created
     * successfully if the value of <code>Status</code> is <code>CREATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occurred, call <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset creation fails if a terminal error occurs (<code>Status</code> = <code>CREATE_FAILED</code>). Currently,
     * you can't access the terminal error information.
     * </p>
     * <p>
     * For more information, see Creating dataset in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateDataset</code> action. If you want to
     * copy an existing dataset, you also require permission to perform the <code>rekognition:ListDatasetEntries</code>
     * action.
     * </p>
     * 
     * @param createDatasetRequest
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateDataset
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a new Amazon Rekognition Custom Labels dataset. You can create a dataset by using an Amazon Sagemaker
     * format manifest file or by copying an existing Amazon Rekognition Custom Labels dataset.
     * </p>
     * <p>
     * To create a training dataset for a project, specify <code>train</code> for the value of <code>DatasetType</code>.
     * To create the test dataset for a project, specify <code>test</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * The response from <code>CreateDataset</code> is the Amazon Resource Name (ARN) for the dataset. Creating a
     * dataset takes a while to complete. Use <a>DescribeDataset</a> to check the current status. The dataset created
     * successfully if the value of <code>Status</code> is <code>CREATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occurred, call <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset creation fails if a terminal error occurs (<code>Status</code> = <code>CREATE_FAILED</code>). Currently,
     * you can't access the terminal error information.
     * </p>
     * <p>
     * For more information, see Creating dataset in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateDataset</code> action. If you want to
     * copy an existing dataset, you also require permission to perform the <code>rekognition:ListDatasetEntries</code>
     * action.
     * </p>
     * 
     * @param createDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateDataset
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Rekognition Custom Labels project. A project is a group of resources (datasets, model
     * versions) that you use to create and manage Amazon Rekognition Custom Labels models.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateProject</code> action.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateProject
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a new Amazon Rekognition Custom Labels project. A project is a group of resources (datasets, model
     * versions) that you use to create and manage Amazon Rekognition Custom Labels models.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateProject</code> action.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateProject
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom
     * Labels project. The response from <code>CreateProjectVersion</code> is an Amazon Resource Name (ARN) for the
     * version of the model.
     * </p>
     * <p>
     * Training uses the training and test datasets associated with the project. For more information, see Creating
     * training and test dataset in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can train a modelin a project that doesn't have associated datasets by specifying manifest files in the
     * <code>TrainingData</code> and <code>TestingData</code> fields.
     * </p>
     * <p>
     * If you open the console after training a model with manifest files, Amazon Rekognition Custom Labels creates the
     * datasets for you using the most recent manifest files. You can no longer train a model version for the project by
     * specifying manifest files.
     * </p>
     * <p>
     * Instead of training with a project without associated datasets, we recommend that you use the manifest files to
     * create training and test datasets for the project.
     * </p>
     * </note>
     * <p>
     * Training takes a while to complete. You can get the current status by calling <a>DescribeProjectVersions</a>.
     * Training completed successfully if the value of the <code>Status</code> field is <code>TRAINING_COMPLETED</code>.
     * </p>
     * <p>
     * If training fails, see Debugging a failed model training in the <i>Amazon Rekognition Custom Labels</i> developer
     * guide.
     * </p>
     * <p>
     * Once training has successfully completed, call <a>DescribeProjectVersions</a> to get the training results and
     * evaluate the model. For more information, see Improving a trained Amazon Rekognition Custom Labels model in the
     * <i>Amazon Rekognition Custom Labels</i> developers guide.
     * </p>
     * <p>
     * After evaluating the model, you start the model by calling <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateProjectVersion</code> action.
     * </p>
     * 
     * @param createProjectVersionRequest
     * @return A Java Future containing the result of the CreateProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateProjectVersion
     */
    java.util.concurrent.Future<CreateProjectVersionResult> createProjectVersionAsync(CreateProjectVersionRequest createProjectVersionRequest);

    /**
     * <p>
     * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom
     * Labels project. The response from <code>CreateProjectVersion</code> is an Amazon Resource Name (ARN) for the
     * version of the model.
     * </p>
     * <p>
     * Training uses the training and test datasets associated with the project. For more information, see Creating
     * training and test dataset in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can train a modelin a project that doesn't have associated datasets by specifying manifest files in the
     * <code>TrainingData</code> and <code>TestingData</code> fields.
     * </p>
     * <p>
     * If you open the console after training a model with manifest files, Amazon Rekognition Custom Labels creates the
     * datasets for you using the most recent manifest files. You can no longer train a model version for the project by
     * specifying manifest files.
     * </p>
     * <p>
     * Instead of training with a project without associated datasets, we recommend that you use the manifest files to
     * create training and test datasets for the project.
     * </p>
     * </note>
     * <p>
     * Training takes a while to complete. You can get the current status by calling <a>DescribeProjectVersions</a>.
     * Training completed successfully if the value of the <code>Status</code> field is <code>TRAINING_COMPLETED</code>.
     * </p>
     * <p>
     * If training fails, see Debugging a failed model training in the <i>Amazon Rekognition Custom Labels</i> developer
     * guide.
     * </p>
     * <p>
     * Once training has successfully completed, call <a>DescribeProjectVersions</a> to get the training results and
     * evaluate the model. For more information, see Improving a trained Amazon Rekognition Custom Labels model in the
     * <i>Amazon Rekognition Custom Labels</i> developers guide.
     * </p>
     * <p>
     * After evaluating the model, you start the model by calling <a>StartProjectVersion</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateProjectVersion</code> action.
     * </p>
     * 
     * @param createProjectVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateProjectVersion
     */
    java.util.concurrent.Future<CreateProjectVersionResult> createProjectVersionAsync(CreateProjectVersionRequest createProjectVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectVersionRequest, CreateProjectVersionResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming
     * video.
     * </p>
     * <p>
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video
     * sends analysis results to Amazon Kinesis Data Streams.
     * </p>
     * <p>
     * You provide as input a Kinesis video stream (<code>Input</code>) and a Kinesis data stream (<code>Output</code>)
     * stream. You also specify the face recognition criteria in <code>Settings</code>. For example, the collection
     * containing faces that you want to recognize. Use <code>Name</code> to assign an identifier for the stream
     * processor. You use <code>Name</code> to manage the stream processor. For example, you can start processing the
     * source video by calling <a>StartStreamProcessor</a> with the <code>Name</code> field.
     * </p>
     * <p>
     * After you have finished analyzing a streaming video, use <a>StopStreamProcessor</a> to stop processing. You can
     * delete the stream processor by calling <a>DeleteStreamProcessor</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateStreamProcessor</code> action. If you
     * want to tag your stream processor, you also require permission to perform the
     * <code>rekognition:TagResource</code> operation.
     * </p>
     * 
     * @param createStreamProcessorRequest
     * @return A Java Future containing the result of the CreateStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsync.CreateStreamProcessor
     */
    java.util.concurrent.Future<CreateStreamProcessorResult> createStreamProcessorAsync(CreateStreamProcessorRequest createStreamProcessorRequest);

    /**
     * <p>
     * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming
     * video.
     * </p>
     * <p>
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video
     * sends analysis results to Amazon Kinesis Data Streams.
     * </p>
     * <p>
     * You provide as input a Kinesis video stream (<code>Input</code>) and a Kinesis data stream (<code>Output</code>)
     * stream. You also specify the face recognition criteria in <code>Settings</code>. For example, the collection
     * containing faces that you want to recognize. Use <code>Name</code> to assign an identifier for the stream
     * processor. You use <code>Name</code> to manage the stream processor. For example, you can start processing the
     * source video by calling <a>StartStreamProcessor</a> with the <code>Name</code> field.
     * </p>
     * <p>
     * After you have finished analyzing a streaming video, use <a>StopStreamProcessor</a> to stop processing. You can
     * delete the stream processor by calling <a>DeleteStreamProcessor</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:CreateStreamProcessor</code> action. If you
     * want to tag your stream processor, you also require permission to perform the
     * <code>rekognition:TagResource</code> operation.
     * </p>
     * 
     * @param createStreamProcessorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.CreateStreamProcessor
     */
    java.util.concurrent.Future<CreateStreamProcessorResult> createStreamProcessorAsync(CreateStreamProcessorRequest createStreamProcessorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamProcessorRequest, CreateStreamProcessorResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>delete-collection-procedure</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteCollection
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest);

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example,
     * see <a>delete-collection-procedure</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteCollection
     */
    java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest deleteCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing Amazon Rekognition Custom Labels dataset. Deleting a dataset might take while. Use
     * <a>DescribeDataset</a> to check the current status. The dataset is still deleting if the value of
     * <code>Status</code> is <code>DELETE_IN_PROGRESS</code>. If you try to access the dataset after it is deleted, you
     * get a <code>ResourceNotFoundException</code> exception.
     * </p>
     * <p>
     * You can't delete a dataset while it is creating (<code>Status</code> = <code>CREATE_IN_PROGRESS</code>) or if the
     * dataset is updating (<code>Status</code> = <code>UPDATE_IN_PROGRESS</code>).
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteDataset</code> action.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteDataset
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes an existing Amazon Rekognition Custom Labels dataset. Deleting a dataset might take while. Use
     * <a>DescribeDataset</a> to check the current status. The dataset is still deleting if the value of
     * <code>Status</code> is <code>DELETE_IN_PROGRESS</code>. If you try to access the dataset after it is deleted, you
     * get a <code>ResourceNotFoundException</code> exception.
     * </p>
     * <p>
     * You can't delete a dataset while it is creating (<code>Status</code> = <code>CREATE_IN_PROGRESS</code>) or if the
     * dataset is updating (<code>Status</code> = <code>UPDATE_IN_PROGRESS</code>).
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteDataset</code> action.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteDataset
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @return A Java Future containing the result of the DeleteFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteFaces
     */
    java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest deleteFacesRequest);

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the
     * collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteFaces
     */
    java.util.concurrent.Future<DeleteFacesResult> deleteFacesAsync(DeleteFacesRequest deleteFacesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFacesRequest, DeleteFacesResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models
     * associated with the project. To delete a model, see <a>DeleteProjectVersion</a>.
     * </p>
     * <p>
     * <code>DeleteProject</code> is an asynchronous operation. To check if the project is deleted, call
     * <a>DescribeProjects</a>. The project is deleted when the project no longer appears in the response.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteProject</code> action.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteProject
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models
     * associated with the project. To delete a model, see <a>DeleteProjectVersion</a>.
     * </p>
     * <p>
     * <code>DeleteProject</code> is an asynchronous operation. To check if the project is deleted, call
     * <a>DescribeProjects</a>. The project is deleted when the project no longer appears in the response.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteProject</code> action.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteProject
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You can't delete a model if it is running or if it is training. To check the status of a model, use the
     * <code>Status</code> field returned from <a>DescribeProjectVersions</a>. To stop a running model call
     * <a>StopProjectVersion</a>. If the model is training, wait until it finishes.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteProjectVersion</code> action.
     * </p>
     * 
     * @param deleteProjectVersionRequest
     * @return A Java Future containing the result of the DeleteProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteProjectVersion
     */
    java.util.concurrent.Future<DeleteProjectVersionResult> deleteProjectVersionAsync(DeleteProjectVersionRequest deleteProjectVersionRequest);

    /**
     * <p>
     * Deletes an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You can't delete a model if it is running or if it is training. To check the status of a model, use the
     * <code>Status</code> field returned from <a>DescribeProjectVersions</a>. To stop a running model call
     * <a>StopProjectVersion</a>. If the model is training, wait until it finishes.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DeleteProjectVersion</code> action.
     * </p>
     * 
     * @param deleteProjectVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteProjectVersion
     */
    java.util.concurrent.Future<DeleteProjectVersionResult> deleteProjectVersionAsync(DeleteProjectVersionRequest deleteProjectVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectVersionRequest, DeleteProjectVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the stream processor identified by <code>Name</code>. You assign the value for <code>Name</code> when you
     * create the stream processor with <a>CreateStreamProcessor</a>. You might not be able to use the same name for a
     * stream processor for a few seconds after calling <code>DeleteStreamProcessor</code>.
     * </p>
     * 
     * @param deleteStreamProcessorRequest
     * @return A Java Future containing the result of the DeleteStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsync.DeleteStreamProcessor
     */
    java.util.concurrent.Future<DeleteStreamProcessorResult> deleteStreamProcessorAsync(DeleteStreamProcessorRequest deleteStreamProcessorRequest);

    /**
     * <p>
     * Deletes the stream processor identified by <code>Name</code>. You assign the value for <code>Name</code> when you
     * create the stream processor with <a>CreateStreamProcessor</a>. You might not be able to use the same name for a
     * stream processor for a few seconds after calling <code>DeleteStreamProcessor</code>.
     * </p>
     * 
     * @param deleteStreamProcessorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DeleteStreamProcessor
     */
    java.util.concurrent.Future<DeleteStreamProcessorResult> deleteStreamProcessorAsync(DeleteStreamProcessorRequest deleteStreamProcessorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamProcessorRequest, DeleteStreamProcessorResult> asyncHandler);

    /**
     * <p>
     * Describes the specified collection. You can use <code>DescribeCollection</code> to get information, such as the
     * number of faces indexed into a collection and the version of the model used by the collection for face detection.
     * </p>
     * <p>
     * For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param describeCollectionRequest
     * @return A Java Future containing the result of the DescribeCollection operation returned by the service.
     * @sample AmazonRekognitionAsync.DescribeCollection
     */
    java.util.concurrent.Future<DescribeCollectionResult> describeCollectionAsync(DescribeCollectionRequest describeCollectionRequest);

    /**
     * <p>
     * Describes the specified collection. You can use <code>DescribeCollection</code> to get information, such as the
     * number of faces indexed into a collection and the version of the model used by the collection for face detection.
     * </p>
     * <p>
     * For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param describeCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCollection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DescribeCollection
     */
    java.util.concurrent.Future<DescribeCollectionResult> describeCollectionAsync(DescribeCollectionRequest describeCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCollectionRequest, DescribeCollectionResult> asyncHandler);

    /**
     * <p>
     * Describes an Amazon Rekognition Custom Labels dataset. You can get information such as the current status of a
     * dataset and statistics about the images and labels in a dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeDataset</code> action.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonRekognitionAsync.DescribeDataset
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describes an Amazon Rekognition Custom Labels dataset. You can get information such as the current status of a
     * dataset and statistics about the images and labels in a dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeDataset</code> action.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DescribeDataset
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Lists and describes the versions of a model in an Amazon Rekognition Custom Labels project. You can specify up to
     * 10 model versions in <code>ProjectVersionArns</code>. If you don't specify a value, descriptions for all model
     * versions in the project are returned.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeProjectVersions</code> action.
     * </p>
     * 
     * @param describeProjectVersionsRequest
     * @return A Java Future containing the result of the DescribeProjectVersions operation returned by the service.
     * @sample AmazonRekognitionAsync.DescribeProjectVersions
     */
    java.util.concurrent.Future<DescribeProjectVersionsResult> describeProjectVersionsAsync(DescribeProjectVersionsRequest describeProjectVersionsRequest);

    /**
     * <p>
     * Lists and describes the versions of a model in an Amazon Rekognition Custom Labels project. You can specify up to
     * 10 model versions in <code>ProjectVersionArns</code>. If you don't specify a value, descriptions for all model
     * versions in the project are returned.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeProjectVersions</code> action.
     * </p>
     * 
     * @param describeProjectVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProjectVersions operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DescribeProjectVersions
     */
    java.util.concurrent.Future<DescribeProjectVersionsResult> describeProjectVersionsAsync(DescribeProjectVersionsRequest describeProjectVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectVersionsRequest, DescribeProjectVersionsResult> asyncHandler);

    /**
     * <p>
     * Gets information about your Amazon Rekognition Custom Labels projects.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeProjects</code> action.
     * </p>
     * 
     * @param describeProjectsRequest
     * @return A Java Future containing the result of the DescribeProjects operation returned by the service.
     * @sample AmazonRekognitionAsync.DescribeProjects
     */
    java.util.concurrent.Future<DescribeProjectsResult> describeProjectsAsync(DescribeProjectsRequest describeProjectsRequest);

    /**
     * <p>
     * Gets information about your Amazon Rekognition Custom Labels projects.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DescribeProjects</code> action.
     * </p>
     * 
     * @param describeProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProjects operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DescribeProjects
     */
    java.util.concurrent.Future<DescribeProjectsResult> describeProjectsAsync(DescribeProjectsRequest describeProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectsRequest, DescribeProjectsResult> asyncHandler);

    /**
     * <p>
     * Provides information about a stream processor created by <a>CreateStreamProcessor</a>. You can get information
     * about the input and output streams, the input parameters for the face recognition being performed, and the
     * current status of the stream processor.
     * </p>
     * 
     * @param describeStreamProcessorRequest
     * @return A Java Future containing the result of the DescribeStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsync.DescribeStreamProcessor
     */
    java.util.concurrent.Future<DescribeStreamProcessorResult> describeStreamProcessorAsync(DescribeStreamProcessorRequest describeStreamProcessorRequest);

    /**
     * <p>
     * Provides information about a stream processor created by <a>CreateStreamProcessor</a>. You can get information
     * about the input and output streams, the input parameters for the face recognition being performed, and the
     * current status of the stream processor.
     * </p>
     * 
     * @param describeStreamProcessorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DescribeStreamProcessor
     */
    java.util.concurrent.Future<DescribeStreamProcessorResult> describeStreamProcessorAsync(DescribeStreamProcessorRequest describeStreamProcessorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamProcessorRequest, DescribeStreamProcessorResult> asyncHandler);

    /**
     * <p>
     * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You specify which version of a model version to use by using the <code>ProjectVersionArn</code> input parameter.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object that the model version detects on an image, the API returns a (<code>CustomLabel</code>) object
     * in an array (<code>CustomLabels</code>). Each <code>CustomLabel</code> object provides the label name (
     * <code>Name</code>), the level of confidence that the image contains the object (<code>Confidence</code>), and
     * object location information, if it exists, for the label on the image (<code>Geometry</code>).
     * </p>
     * <p>
     * To filter labels that are returned, specify a value for <code>MinConfidence</code>.
     * <code>DetectCustomLabelsLabels</code> only returns labels with a confidence that's higher than the specified
     * value. The value of <code>MinConfidence</code> maps to the assumed threshold values created during training. For
     * more information, see <i>Assumed threshold</i> in the Amazon Rekognition Custom Labels Developer Guide. Amazon
     * Rekognition Custom Labels metrics expresses an assumed threshold as a floating point value between 0-1. The range
     * of <code>MinConfidence</code> normalizes the threshold value to a percentage value (0-100). Confidence responses
     * from <code>DetectCustomLabels</code> are also returned as a percentage. You can use <code>MinConfidence</code> to
     * change the precision and recall or your model. For more information, see <i>Analyzing an image</i> in the Amazon
     * Rekognition Custom Labels Developer Guide.
     * </p>
     * <p>
     * If you don't specify a value for <code>MinConfidence</code>, <code>DetectCustomLabels</code> returns labels based
     * on the assumed threshold of each label.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectCustomLabels</code> action.
     * </p>
     * <p>
     * For more information, see <i>Analyzing an image</i> in the Amazon Rekognition Custom Labels Developer Guide.
     * </p>
     * 
     * @param detectCustomLabelsRequest
     * @return A Java Future containing the result of the DetectCustomLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectCustomLabels
     */
    java.util.concurrent.Future<DetectCustomLabelsResult> detectCustomLabelsAsync(DetectCustomLabelsRequest detectCustomLabelsRequest);

    /**
     * <p>
     * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.
     * </p>
     * <p>
     * You specify which version of a model version to use by using the <code>ProjectVersionArn</code> input parameter.
     * </p>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object that the model version detects on an image, the API returns a (<code>CustomLabel</code>) object
     * in an array (<code>CustomLabels</code>). Each <code>CustomLabel</code> object provides the label name (
     * <code>Name</code>), the level of confidence that the image contains the object (<code>Confidence</code>), and
     * object location information, if it exists, for the label on the image (<code>Geometry</code>).
     * </p>
     * <p>
     * To filter labels that are returned, specify a value for <code>MinConfidence</code>.
     * <code>DetectCustomLabelsLabels</code> only returns labels with a confidence that's higher than the specified
     * value. The value of <code>MinConfidence</code> maps to the assumed threshold values created during training. For
     * more information, see <i>Assumed threshold</i> in the Amazon Rekognition Custom Labels Developer Guide. Amazon
     * Rekognition Custom Labels metrics expresses an assumed threshold as a floating point value between 0-1. The range
     * of <code>MinConfidence</code> normalizes the threshold value to a percentage value (0-100). Confidence responses
     * from <code>DetectCustomLabels</code> are also returned as a percentage. You can use <code>MinConfidence</code> to
     * change the precision and recall or your model. For more information, see <i>Analyzing an image</i> in the Amazon
     * Rekognition Custom Labels Developer Guide.
     * </p>
     * <p>
     * If you don't specify a value for <code>MinConfidence</code>, <code>DetectCustomLabels</code> returns labels based
     * on the assumed threshold of each label.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectCustomLabels</code> action.
     * </p>
     * <p>
     * For more information, see <i>Analyzing an image</i> in the Amazon Rekognition Custom Labels Developer Guide.
     * </p>
     * 
     * @param detectCustomLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectCustomLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectCustomLabels
     */
    java.util.concurrent.Future<DetectCustomLabelsResult> detectCustomLabelsAsync(DetectCustomLabelsRequest detectCustomLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DetectCustomLabelsRequest, DetectCustomLabelsResult> asyncHandler);

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For each face detected, the operation
     * returns face details. These details include a bounding box of the face, a confidence value (that the bounding box
     * contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and
     * mouth), presence of beard, sunglasses, and so on.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * might not detect the faces or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @return A Java Future containing the result of the DetectFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectFaces
     */
    java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest detectFacesRequest);

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For each face detected, the operation
     * returns face details. These details include a bounding box of the face, a confidence value (that the bounding box
     * contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and
     * mouth), presence of beard, sunglasses, and so on.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm
     * might not detect the faces or might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectFaces
     */
    java.util.concurrent.Future<DetectFacesResult> detectFacesAsync(DetectFacesRequest detectFacesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectFacesRequest, DetectFacesResult> asyncHandler);

    /**
     * <p>
     * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature.
     * </p>
     * <p>
     * For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.
     * </p>
     * <note>
     * <p>
     * <code>DetectLabels</code> does not support the detection of activities. However, activity detection is supported
     * for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer
     * Guide.
     * </p>
     * </note>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response includes all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * In response, the API returns an array of labels. In addition, the response also includes the orientation
     * correction. Optionally, you can specify <code>MinConfidence</code> to control the confidence threshold for the
     * labels returned. The default is 55%. You can also add the <code>MaxLabels</code> parameter to limit the number of
     * labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * <code>DetectLabels</code> returns bounding boxes for instances of common object labels in an array of
     * <a>Instance</a> objects. An <code>Instance</code> object contains a <a>BoundingBox</a> object, for the location
     * of the label on the image. It also includes the confidence by which the bounding box was detected.
     * </p>
     * <p>
     * <code>DetectLabels</code> also returns a hierarchical taxonomy of detected labels. For example, a detected car
     * might be assigned the label <i>car</i>. The label <i>car</i> has two parent labels: <i>Vehicle</i> (its parent)
     * and <i>Transportation</i> (its grandparent). The response returns the entire list of ancestors for a label. Each
     * ancestor is a unique label in the response. In the previous example, <i>Car</i>, <i>Vehicle</i>, and
     * <i>Transportation</i> are returned as unique labels in the response.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @return A Java Future containing the result of the DetectLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectLabels
     */
    java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest detectLabelsRequest);

    /**
     * <p>
     * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects
     * like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape,
     * evening, and nature.
     * </p>
     * <p>
     * For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.
     * </p>
     * <note>
     * <p>
     * <code>DetectLabels</code> does not support the detection of activities. However, activity detection is supported
     * for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer
     * Guide.
     * </p>
     * </note>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If
     * you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must
     * be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and
     * the level of confidence that the image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response includes all three labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the three objects. The operation can also
     * return multiple labels for the same object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the flower as a tulip.
     * </p>
     * <p>
     * In response, the API returns an array of labels. In addition, the response also includes the orientation
     * correction. Optionally, you can specify <code>MinConfidence</code> to control the confidence threshold for the
     * labels returned. The default is 55%. You can also add the <code>MaxLabels</code> parameter to limit the number of
     * labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the same facial details that the
     * <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * <code>DetectLabels</code> returns bounding boxes for instances of common object labels in an array of
     * <a>Instance</a> objects. An <code>Instance</code> object contains a <a>BoundingBox</a> object, for the location
     * of the label on the image. It also includes the confidence by which the bounding box was detected.
     * </p>
     * <p>
     * <code>DetectLabels</code> also returns a hierarchical taxonomy of detected labels. For example, a detected car
     * might be assigned the label <i>car</i>. The label <i>car</i> has two parent labels: <i>Vehicle</i> (its parent)
     * and <i>Transportation</i> (its grandparent). The response returns the entire list of ancestors for a label. Each
     * ancestor is a unique label in the response. In the previous example, <i>Car</i>, <i>Vehicle</i>, and
     * <i>Transportation</i> are returned as unique labels in the response.
     * </p>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectLabels
     */
    java.util.concurrent.Future<DetectLabelsResult> detectLabelsAsync(DetectLabelsRequest detectLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DetectLabelsRequest, DetectLabelsResult> asyncHandler);

    /**
     * <p>
     * Detects unsafe content in a specified JPEG or PNG format image. Use <code>DetectModerationLabels</code> to
     * moderate images depending on your requirements. For example, you might want to filter images that contain nudity,
     * but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by <code>DetectModerationLabels</code> to determine which types of
     * content are appropriate.
     * </p>
     * <p>
     * For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @return A Java Future containing the result of the DetectModerationLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectModerationLabels
     */
    java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest detectModerationLabelsRequest);

    /**
     * <p>
     * Detects unsafe content in a specified JPEG or PNG format image. Use <code>DetectModerationLabels</code> to
     * moderate images depending on your requirements. For example, you might want to filter images that contain nudity,
     * but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by <code>DetectModerationLabels</code> to determine which types of
     * content are appropriate.
     * </p>
     * <p>
     * For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectModerationLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectModerationLabels
     */
    java.util.concurrent.Future<DetectModerationLabelsResult> detectModerationLabelsAsync(DetectModerationLabelsRequest detectModerationLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DetectModerationLabelsRequest, DetectModerationLabelsResult> asyncHandler);

    /**
     * <p>
     * Detects Personal Protective Equipment (PPE) worn by people detected in an image. Amazon Rekognition can detect
     * the following types of PPE.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Face cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Hand cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Head cover
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. The
     * image must be either a PNG or JPG formatted file.
     * </p>
     * <p>
     * <code>DetectProtectiveEquipment</code> detects PPE worn by up to 15 persons detected in an image.
     * </p>
     * <p>
     * For each person detected in the image the API returns an array of body parts (face, head, left-hand, right-hand).
     * For each body part, an array of detected items of PPE is returned, including an indicator of whether or not the
     * PPE covers the body part. The API returns the confidence it has in each detection (person, PPE, body part and
     * body part coverage). It also returns a bounding box (<a>BoundingBox</a>) for each detected person and each
     * detected item of PPE.
     * </p>
     * <p>
     * You can optionally request a summary of detected PPE items with the <code>SummarizationAttributes</code> input
     * parameter. The summary provides the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The persons detected as wearing all of the types of PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected as not wearing all of the types PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected where PPE adornment could not be determined.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectProtectiveEquipment</code> action.
     * </p>
     * 
     * @param detectProtectiveEquipmentRequest
     * @return A Java Future containing the result of the DetectProtectiveEquipment operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectProtectiveEquipment
     */
    java.util.concurrent.Future<DetectProtectiveEquipmentResult> detectProtectiveEquipmentAsync(
            DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest);

    /**
     * <p>
     * Detects Personal Protective Equipment (PPE) worn by people detected in an image. Amazon Rekognition can detect
     * the following types of PPE.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Face cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Hand cover
     * </p>
     * </li>
     * <li>
     * <p>
     * Head cover
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. The
     * image must be either a PNG or JPG formatted file.
     * </p>
     * <p>
     * <code>DetectProtectiveEquipment</code> detects PPE worn by up to 15 persons detected in an image.
     * </p>
     * <p>
     * For each person detected in the image the API returns an array of body parts (face, head, left-hand, right-hand).
     * For each body part, an array of detected items of PPE is returned, including an indicator of whether or not the
     * PPE covers the body part. The API returns the confidence it has in each detection (person, PPE, body part and
     * body part coverage). It also returns a bounding box (<a>BoundingBox</a>) for each detected person and each
     * detected item of PPE.
     * </p>
     * <p>
     * You can optionally request a summary of detected PPE items with the <code>SummarizationAttributes</code> input
     * parameter. The summary provides the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The persons detected as wearing all of the types of PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected as not wearing all of the types PPE that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * The persons detected where PPE adornment could not be determined.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This is a stateless API operation. That is, the operation does not persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DetectProtectiveEquipment</code> action.
     * </p>
     * 
     * @param detectProtectiveEquipmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectProtectiveEquipment operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectProtectiveEquipment
     */
    java.util.concurrent.Future<DetectProtectiveEquipmentResult> detectProtectiveEquipmentAsync(
            DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest,
            com.amazonaws.handlers.AsyncHandler<DetectProtectiveEquipmentRequest, DetectProtectiveEquipmentResult> asyncHandler);

    /**
     * <p>
     * Detects text in the input image and converts it into machine-readable text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you
     * use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon
     * S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg
     * formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of <a>TextDetection</a> elements,
     * <code>TextDetections</code>. Each <code>TextDetection</code> element provides information about a single word or
     * line of text that was detected in the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not separated by spaces. <code>DetectText</code>
     * can detect up to 100 words in an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's
     * license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when
     * there is a large gap between words, relative to the length of the words. This means, depending on the gap between
     * words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't
     * represent the end of a line. If a sentence spans multiple lines, the <code>DetectText</code> operation returns
     * multiple lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of text or a word, use the
     * <code>TextDetection</code> object <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 90 degrees orientation of the horizontal axis.
     * </p>
     * <p>
     * For more information, see DetectText in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param detectTextRequest
     * @return A Java Future containing the result of the DetectText operation returned by the service.
     * @sample AmazonRekognitionAsync.DetectText
     */
    java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest detectTextRequest);

    /**
     * <p>
     * Detects text in the input image and converts it into machine-readable text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you
     * use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon
     * S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg
     * formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of <a>TextDetection</a> elements,
     * <code>TextDetections</code>. Each <code>TextDetection</code> element provides information about a single word or
     * line of text that was detected in the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not separated by spaces. <code>DetectText</code>
     * can detect up to 100 words in an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's
     * license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when
     * there is a large gap between words, relative to the length of the words. This means, depending on the gap between
     * words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't
     * represent the end of a line. If a sentence spans multiple lines, the <code>DetectText</code> operation returns
     * multiple lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of text or a word, use the
     * <code>TextDetection</code> object <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 90 degrees orientation of the horizontal axis.
     * </p>
     * <p>
     * For more information, see DetectText in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param detectTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectText operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DetectText
     */
    java.util.concurrent.Future<DetectTextResult> detectTextAsync(DetectTextRequest detectTextRequest,
            com.amazonaws.handlers.AsyncHandler<DetectTextRequest, DetectTextResult> asyncHandler);

    /**
     * <p>
     * Distributes the entries (images) in a training dataset across the training dataset and the test dataset for a
     * project. <code>DistributeDatasetEntries</code> moves 20% of the training dataset images to the test dataset. An
     * entry is a JSON Line that describes an image.
     * </p>
     * <p>
     * You supply the Amazon Resource Names (ARN) of a project's training dataset and test dataset. The training dataset
     * must contain the images that you want to split. The test dataset must be empty. The datasets must belong to the
     * same project. To create training and test datasets for a project, call <a>CreateDataset</a>.
     * </p>
     * <p>
     * Distributing a dataset takes a while to complete. To check the status call <code>DescribeDataset</code>. The
     * operation is complete when the <code>Status</code> field for the training dataset and the test dataset is
     * <code>UPDATE_COMPLETE</code>. If the dataset split fails, the value of <code>Status</code> is
     * <code>UPDATE_FAILED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DistributeDatasetEntries</code> action.
     * </p>
     * 
     * @param distributeDatasetEntriesRequest
     * @return A Java Future containing the result of the DistributeDatasetEntries operation returned by the service.
     * @sample AmazonRekognitionAsync.DistributeDatasetEntries
     */
    java.util.concurrent.Future<DistributeDatasetEntriesResult> distributeDatasetEntriesAsync(DistributeDatasetEntriesRequest distributeDatasetEntriesRequest);

    /**
     * <p>
     * Distributes the entries (images) in a training dataset across the training dataset and the test dataset for a
     * project. <code>DistributeDatasetEntries</code> moves 20% of the training dataset images to the test dataset. An
     * entry is a JSON Line that describes an image.
     * </p>
     * <p>
     * You supply the Amazon Resource Names (ARN) of a project's training dataset and test dataset. The training dataset
     * must contain the images that you want to split. The test dataset must be empty. The datasets must belong to the
     * same project. To create training and test datasets for a project, call <a>CreateDataset</a>.
     * </p>
     * <p>
     * Distributing a dataset takes a while to complete. To check the status call <code>DescribeDataset</code>. The
     * operation is complete when the <code>Status</code> field for the training dataset and the test dataset is
     * <code>UPDATE_COMPLETE</code>. If the dataset split fails, the value of <code>Status</code> is
     * <code>UPDATE_FAILED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:DistributeDatasetEntries</code> action.
     * </p>
     * 
     * @param distributeDatasetEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DistributeDatasetEntries operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.DistributeDatasetEntries
     */
    java.util.concurrent.Future<DistributeDatasetEntriesResult> distributeDatasetEntriesAsync(DistributeDatasetEntriesRequest distributeDatasetEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<DistributeDatasetEntriesRequest, DistributeDatasetEntriesResult> asyncHandler);

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on their Amazon Rekognition ID. The additional
     * information is returned as an array of URLs. If there is no additional information about the celebrity, this list
     * is empty.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @return A Java Future containing the result of the GetCelebrityInfo operation returned by the service.
     * @sample AmazonRekognitionAsync.GetCelebrityInfo
     */
    java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest getCelebrityInfoRequest);

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on their Amazon Rekognition ID. The additional
     * information is returned as an array of URLs. If there is no additional information about the celebrity, this list
     * is empty.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCelebrityInfo operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetCelebrityInfo
     */
    java.util.concurrent.Future<GetCelebrityInfoResult> getCelebrityInfoAsync(GetCelebrityInfoRequest getCelebrityInfoRequest,
            com.amazonaws.handlers.AsyncHandler<GetCelebrityInfoRequest, GetCelebrityInfoResult> asyncHandler);

    /**
     * <p>
     * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by
     * <a>StartCelebrityRecognition</a>.
     * </p>
     * <p>
     * Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to
     * <a>StartCelebrityRecognition</a> which returns a job identifier (<code>JobId</code>).
     * </p>
     * <p>
     * When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the
     * Amazon Simple Notification Service topic registered in the initial call to <code>StartCelebrityRecognition</code>
     * . To get the results of the celebrity recognition analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetCelebrityDetection</code> and pass the job
     * identifier (<code>JobId</code>) from the initial call to <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the time(s) they are detected in an array (
     * <code>Celebrities</code>) of <a>CelebrityRecognition</a> objects. Each <code>CelebrityRecognition</code> contains
     * information about the celebrity in a <a>CelebrityDetail</a> object and the time, <code>Timestamp</code>, the
     * celebrity was detected. This <a>CelebrityDetail</a> object stores information about the detected celebrity's face
     * attributes, a face bounding box, known gender, the celebrity's name, and a confidence estimate.
     * </p>
     * <note>
     * <p>
     * <code>GetCelebrityRecognition</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * <code>BoundingBox</code> field only applies to the detected face instance. The other facial attributes listed in
     * the <code>Face</code> object of the following response syntax are not returned. For more information, see
     * FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Celebrities</code> array is sorted by time (milliseconds from the start of the video). You
     * can also sort the array by celebrity by specifying the value <code>ID</code> in the <code>SortBy</code> input
     * parameter.
     * </p>
     * <p>
     * The <code>CelebrityDetail</code> object includes the celebrity identifer and additional information urls. If you
     * don't store the additional information urls, you can get them later by calling <a>GetCelebrityInfo</a> with the
     * celebrity identifer.
     * </p>
     * <p>
     * No information is returned for faces not recognized as celebrities.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call
     * <code>GetCelebrityDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetCelebrityRecognition</code>.
     * </p>
     * 
     * @param getCelebrityRecognitionRequest
     * @return A Java Future containing the result of the GetCelebrityRecognition operation returned by the service.
     * @sample AmazonRekognitionAsync.GetCelebrityRecognition
     */
    java.util.concurrent.Future<GetCelebrityRecognitionResult> getCelebrityRecognitionAsync(GetCelebrityRecognitionRequest getCelebrityRecognitionRequest);

    /**
     * <p>
     * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by
     * <a>StartCelebrityRecognition</a>.
     * </p>
     * <p>
     * Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to
     * <a>StartCelebrityRecognition</a> which returns a job identifier (<code>JobId</code>).
     * </p>
     * <p>
     * When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the
     * Amazon Simple Notification Service topic registered in the initial call to <code>StartCelebrityRecognition</code>
     * . To get the results of the celebrity recognition analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetCelebrityDetection</code> and pass the job
     * identifier (<code>JobId</code>) from the initial call to <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the time(s) they are detected in an array (
     * <code>Celebrities</code>) of <a>CelebrityRecognition</a> objects. Each <code>CelebrityRecognition</code> contains
     * information about the celebrity in a <a>CelebrityDetail</a> object and the time, <code>Timestamp</code>, the
     * celebrity was detected. This <a>CelebrityDetail</a> object stores information about the detected celebrity's face
     * attributes, a face bounding box, known gender, the celebrity's name, and a confidence estimate.
     * </p>
     * <note>
     * <p>
     * <code>GetCelebrityRecognition</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * <code>BoundingBox</code> field only applies to the detected face instance. The other facial attributes listed in
     * the <code>Face</code> object of the following response syntax are not returned. For more information, see
     * FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Celebrities</code> array is sorted by time (milliseconds from the start of the video). You
     * can also sort the array by celebrity by specifying the value <code>ID</code> in the <code>SortBy</code> input
     * parameter.
     * </p>
     * <p>
     * The <code>CelebrityDetail</code> object includes the celebrity identifer and additional information urls. If you
     * don't store the additional information urls, you can get them later by calling <a>GetCelebrityInfo</a> with the
     * celebrity identifer.
     * </p>
     * <p>
     * No information is returned for faces not recognized as celebrities.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call
     * <code>GetCelebrityDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetCelebrityRecognition</code>.
     * </p>
     * 
     * @param getCelebrityRecognitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCelebrityRecognition operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetCelebrityRecognition
     */
    java.util.concurrent.Future<GetCelebrityRecognitionResult> getCelebrityRecognitionAsync(GetCelebrityRecognitionRequest getCelebrityRecognitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCelebrityRecognitionRequest, GetCelebrityRecognitionResult> asyncHandler);

    /**
     * <p>
     * Gets the inappropriate, unwanted, or offensive content analysis results for a Amazon Rekognition Video analysis
     * started by <a>StartContentModeration</a>. For a list of moderation labels in Amazon Rekognition, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api">Using the image and video
     * moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video inappropriate or offensive content detection in a stored video is an asynchronous
     * operation. You start analysis by calling <a>StartContentModeration</a> which returns a job identifier (
     * <code>JobId</code>). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to <code>StartContentModeration</code>. To get
     * the results of the content analysis, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <code>GetContentModeration</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected inappropriate, unwanted, or offensive content moderation
     * labels, and the time they are detected, in an array, <code>ModerationLabels</code>, of
     * <a>ContentModerationDetection</a> objects.
     * </p>
     * <p>
     * By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You
     * can also sort them by moderated label by specifying <code>NAME</code> for the <code>SortBy</code> input
     * parameter.
     * </p>
     * <p>
     * Since video analysis can return a large number of results, use the <code>MaxResults</code> parameter to limit the
     * number of labels returned in a single call to <code>GetContentModeration</code>. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetContentModeration</code> and populate the <code>NextToken</code> request parameter with the value of
     * <code>NextToken</code> returned from the previous call to <code>GetContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Content moderation in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getContentModerationRequest
     * @return A Java Future containing the result of the GetContentModeration operation returned by the service.
     * @sample AmazonRekognitionAsync.GetContentModeration
     */
    java.util.concurrent.Future<GetContentModerationResult> getContentModerationAsync(GetContentModerationRequest getContentModerationRequest);

    /**
     * <p>
     * Gets the inappropriate, unwanted, or offensive content analysis results for a Amazon Rekognition Video analysis
     * started by <a>StartContentModeration</a>. For a list of moderation labels in Amazon Rekognition, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api">Using the image and video
     * moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video inappropriate or offensive content detection in a stored video is an asynchronous
     * operation. You start analysis by calling <a>StartContentModeration</a> which returns a job identifier (
     * <code>JobId</code>). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to <code>StartContentModeration</code>. To get
     * the results of the content analysis, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <code>GetContentModeration</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected inappropriate, unwanted, or offensive content moderation
     * labels, and the time they are detected, in an array, <code>ModerationLabels</code>, of
     * <a>ContentModerationDetection</a> objects.
     * </p>
     * <p>
     * By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You
     * can also sort them by moderated label by specifying <code>NAME</code> for the <code>SortBy</code> input
     * parameter.
     * </p>
     * <p>
     * Since video analysis can return a large number of results, use the <code>MaxResults</code> parameter to limit the
     * number of labels returned in a single call to <code>GetContentModeration</code>. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetContentModeration</code> and populate the <code>NextToken</code> request parameter with the value of
     * <code>NextToken</code> returned from the previous call to <code>GetContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Content moderation in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getContentModerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContentModeration operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetContentModeration
     */
    java.util.concurrent.Future<GetContentModerationResult> getContentModerationAsync(GetContentModerationRequest getContentModerationRequest,
            com.amazonaws.handlers.AsyncHandler<GetContentModerationRequest, GetContentModerationResult> asyncHandler);

    /**
     * <p>
     * Gets face detection results for a Amazon Rekognition Video analysis started by <a>StartFaceDetection</a>.
     * </p>
     * <p>
     * Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling
     * <a>StartFaceDetection</a> which returns a job identifier (<code>JobId</code>). When the face detection operation
     * finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartFaceDetection</code>. To get the results of the face detection
     * operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <a>GetFaceDetection</a> and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <code>GetFaceDetection</code> returns an array of detected faces (<code>Faces</code>) sorted by the time the
     * faces were detected.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call <code>GetFaceDetection</code>
     * and populate the <code>NextToken</code> request parameter with the token value returned from the previous call to
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param getFaceDetectionRequest
     * @return A Java Future containing the result of the GetFaceDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.GetFaceDetection
     */
    java.util.concurrent.Future<GetFaceDetectionResult> getFaceDetectionAsync(GetFaceDetectionRequest getFaceDetectionRequest);

    /**
     * <p>
     * Gets face detection results for a Amazon Rekognition Video analysis started by <a>StartFaceDetection</a>.
     * </p>
     * <p>
     * Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling
     * <a>StartFaceDetection</a> which returns a job identifier (<code>JobId</code>). When the face detection operation
     * finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartFaceDetection</code>. To get the results of the face detection
     * operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
     * call <a>GetFaceDetection</a> and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <code>GetFaceDetection</code> returns an array of detected faces (<code>Faces</code>) sorted by the time the
     * faces were detected.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call <code>GetFaceDetection</code>
     * and populate the <code>NextToken</code> request parameter with the token value returned from the previous call to
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param getFaceDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFaceDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetFaceDetection
     */
    java.util.concurrent.Future<GetFaceDetectionResult> getFaceDetectionAsync(GetFaceDetectionRequest getFaceDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetFaceDetectionRequest, GetFaceDetectionResult> asyncHandler);

    /**
     * <p>
     * Gets the face search results for Amazon Rekognition Video face search started by <a>StartFaceSearch</a>. The
     * search returns faces in a collection that match the faces of persons detected in a video. It also includes the
     * time(s) that faces are matched in the video.
     * </p>
     * <p>
     * Face search in a video is an asynchronous operation. You start face search by calling to <a>StartFaceSearch</a>
     * which returns a job identifier (<code>JobId</code>). When the search operation finishes, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartFaceSearch</code>. To get the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetFaceSearch</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>.
     * </p>
     * <p>
     * For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * The search results are retured in an array, <code>Persons</code>, of <a>PersonMatch</a> objects. Each
     * <code>PersonMatch</code> element contains details about the matching faces in the input collection, person
     * information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the
     * person was matched in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetFaceSearch</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned. For more
     * information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Persons</code> array is sorted by the time, in milliseconds from the start of the video,
     * persons are matched. You can also sort by persons by specifying <code>INDEX</code> for the <code>SORTBY</code>
     * input parameter.
     * </p>
     * 
     * @param getFaceSearchRequest
     * @return A Java Future containing the result of the GetFaceSearch operation returned by the service.
     * @sample AmazonRekognitionAsync.GetFaceSearch
     */
    java.util.concurrent.Future<GetFaceSearchResult> getFaceSearchAsync(GetFaceSearchRequest getFaceSearchRequest);

    /**
     * <p>
     * Gets the face search results for Amazon Rekognition Video face search started by <a>StartFaceSearch</a>. The
     * search returns faces in a collection that match the faces of persons detected in a video. It also includes the
     * time(s) that faces are matched in the video.
     * </p>
     * <p>
     * Face search in a video is an asynchronous operation. You start face search by calling to <a>StartFaceSearch</a>
     * which returns a job identifier (<code>JobId</code>). When the search operation finishes, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartFaceSearch</code>. To get the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetFaceSearch</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>.
     * </p>
     * <p>
     * For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * The search results are retured in an array, <code>Persons</code>, of <a>PersonMatch</a> objects. Each
     * <code>PersonMatch</code> element contains details about the matching faces in the input collection, person
     * information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the
     * person was matched in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetFaceSearch</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned. For more
     * information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Persons</code> array is sorted by the time, in milliseconds from the start of the video,
     * persons are matched. You can also sort by persons by specifying <code>INDEX</code> for the <code>SORTBY</code>
     * input parameter.
     * </p>
     * 
     * @param getFaceSearchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFaceSearch operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetFaceSearch
     */
    java.util.concurrent.Future<GetFaceSearchResult> getFaceSearchAsync(GetFaceSearchRequest getFaceSearchRequest,
            com.amazonaws.handlers.AsyncHandler<GetFaceSearchRequest, GetFaceSearchResult> asyncHandler);

    /**
     * <p>
     * Gets the label detection results of a Amazon Rekognition Video analysis started by <a>StartLabelDetection</a>.
     * </p>
     * <p>
     * The label detection operation is started by a call to <a>StartLabelDetection</a> which returns a job identifier (
     * <code>JobId</code>). When the label detection operation finishes, Amazon Rekognition publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartlabelDetection</code>. To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a>
     * and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (<code>Labels</code>) sorted by the time the
     * labels were detected. You can also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and
     * the time the label was detected in the video.
     * </p>
     * <p>
     * The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected
     * labels, and the version of the label model used for detection.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call <code>GetlabelDetection</code>
     * and populate the <code>NextToken</code> request parameter with the token value returned from the previous call to
     * <code>GetLabelDetection</code>.
     * </p>
     * 
     * @param getLabelDetectionRequest
     * @return A Java Future containing the result of the GetLabelDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.GetLabelDetection
     */
    java.util.concurrent.Future<GetLabelDetectionResult> getLabelDetectionAsync(GetLabelDetectionRequest getLabelDetectionRequest);

    /**
     * <p>
     * Gets the label detection results of a Amazon Rekognition Video analysis started by <a>StartLabelDetection</a>.
     * </p>
     * <p>
     * The label detection operation is started by a call to <a>StartLabelDetection</a> which returns a job identifier (
     * <code>JobId</code>). When the label detection operation finishes, Amazon Rekognition publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartlabelDetection</code>. To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a>
     * and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (<code>Labels</code>) sorted by the time the
     * labels were detected. You can also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and
     * the time the label was detected in the video.
     * </p>
     * <p>
     * The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected
     * labels, and the version of the label model used for detection.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of results, call <code>GetlabelDetection</code>
     * and populate the <code>NextToken</code> request parameter with the token value returned from the previous call to
     * <code>GetLabelDetection</code>.
     * </p>
     * 
     * @param getLabelDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLabelDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetLabelDetection
     */
    java.util.concurrent.Future<GetLabelDetectionResult> getLabelDetectionAsync(GetLabelDetectionRequest getLabelDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetLabelDetectionRequest, GetLabelDetectionResult> asyncHandler);

    /**
     * <p>
     * Gets the path tracking results of a Amazon Rekognition Video analysis started by <a>StartPersonTracking</a>.
     * </p>
     * <p>
     * The person path tracking operation is started by a call to <code>StartPersonTracking</code> which returns a job
     * identifier (<code>JobId</code>). When the operation finishes, Amazon Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * To get the results of the person path tracking operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * <code>GetPersonTracking</code> returns an array, <code>Persons</code>, of tracked persons and the time(s) their
     * paths were tracked in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetPersonTracking</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned.
     * </p>
     * <p>
     * For more information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked
     * persons by specifying <code>INDEX</code> for the <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of items returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetPersonTracking</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetPersonTracking</code>.
     * </p>
     * 
     * @param getPersonTrackingRequest
     * @return A Java Future containing the result of the GetPersonTracking operation returned by the service.
     * @sample AmazonRekognitionAsync.GetPersonTracking
     */
    java.util.concurrent.Future<GetPersonTrackingResult> getPersonTrackingAsync(GetPersonTrackingRequest getPersonTrackingRequest);

    /**
     * <p>
     * Gets the path tracking results of a Amazon Rekognition Video analysis started by <a>StartPersonTracking</a>.
     * </p>
     * <p>
     * The person path tracking operation is started by a call to <code>StartPersonTracking</code> which returns a job
     * identifier (<code>JobId</code>). When the operation finishes, Amazon Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic registered in the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * To get the results of the person path tracking operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * <code>GetPersonTracking</code> returns an array, <code>Persons</code>, of tracked persons and the time(s) their
     * paths were tracked in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetPersonTracking</code> only returns the default facial attributes (<code>BoundingBox</code>,
     * <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following response syntax are not returned.
     * </p>
     * <p>
     * For more information, see FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked
     * persons by specifying <code>INDEX</code> for the <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of items returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetPersonTracking</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetPersonTracking</code>.
     * </p>
     * 
     * @param getPersonTrackingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPersonTracking operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetPersonTracking
     */
    java.util.concurrent.Future<GetPersonTrackingResult> getPersonTrackingAsync(GetPersonTrackingRequest getPersonTrackingRequest,
            com.amazonaws.handlers.AsyncHandler<GetPersonTrackingRequest, GetPersonTrackingResult> asyncHandler);

    /**
     * <p>
     * Gets the segment detection results of a Amazon Rekognition Video analysis started by
     * <a>StartSegmentDetection</a>.
     * </p>
     * <p>
     * Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by
     * calling <a>StartSegmentDetection</a> which returns a job identifier (<code>JobId</code>). When the segment
     * detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification
     * Service topic registered in the initial call to <code>StartSegmentDetection</code>. To get the results of the
     * segment detection operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. if so, call <code>GetSegmentDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call of <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * <code>GetSegmentDetection</code> returns detected segments in an array (<code>Segments</code>) of
     * <a>SegmentDetection</a> objects. <code>Segments</code> is sorted by the segment types specified in the
     * <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Each element of the array
     * includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the
     * segment, and the frame in which the segment was detected.
     * </p>
     * <p>
     * Use <code>SelectedSegmentTypes</code> to find out the type of segment detection requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of segment detections returned. If there are more
     * results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response
     * contains a pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetSegmentDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getSegmentDetectionRequest
     * @return A Java Future containing the result of the GetSegmentDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.GetSegmentDetection
     */
    java.util.concurrent.Future<GetSegmentDetectionResult> getSegmentDetectionAsync(GetSegmentDetectionRequest getSegmentDetectionRequest);

    /**
     * <p>
     * Gets the segment detection results of a Amazon Rekognition Video analysis started by
     * <a>StartSegmentDetection</a>.
     * </p>
     * <p>
     * Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by
     * calling <a>StartSegmentDetection</a> which returns a job identifier (<code>JobId</code>). When the segment
     * detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification
     * Service topic registered in the initial call to <code>StartSegmentDetection</code>. To get the results of the
     * segment detection operation, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. if so, call <code>GetSegmentDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call of <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * <code>GetSegmentDetection</code> returns detected segments in an array (<code>Segments</code>) of
     * <a>SegmentDetection</a> objects. <code>Segments</code> is sorted by the segment types specified in the
     * <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Each element of the array
     * includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the
     * segment, and the frame in which the segment was detected.
     * </p>
     * <p>
     * Use <code>SelectedSegmentTypes</code> to find out the type of segment detection requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of segment detections returned. If there are more
     * results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response
     * contains a pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetSegmentDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param getSegmentDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetSegmentDetection
     */
    java.util.concurrent.Future<GetSegmentDetectionResult> getSegmentDetectionAsync(GetSegmentDetectionRequest getSegmentDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentDetectionRequest, GetSegmentDetectionResult> asyncHandler);

    /**
     * <p>
     * Gets the text detection results of a Amazon Rekognition Video analysis started by <a>StartTextDetection</a>.
     * </p>
     * <p>
     * Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling
     * <a>StartTextDetection</a> which returns a job identifier (<code>JobId</code>) When the text detection operation
     * finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartTextDetection</code>. To get the results of the text detection
     * operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. if so,
     * call <code>GetTextDetection</code> and pass the job identifier (<code>JobId</code>) from the initial call of
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetTextDetection</code> returns an array of detected text (<code>TextDetections</code>) sorted by the time
     * the text was detected, up to 50 words per frame of video.
     * </p>
     * <p>
     * Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected
     * text, the time the text was detected, bounding box information for where the text was located, and unique
     * identifiers for words and their lines.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of text detections returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetTextDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetTextDetection</code>.
     * </p>
     * 
     * @param getTextDetectionRequest
     * @return A Java Future containing the result of the GetTextDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.GetTextDetection
     */
    java.util.concurrent.Future<GetTextDetectionResult> getTextDetectionAsync(GetTextDetectionRequest getTextDetectionRequest);

    /**
     * <p>
     * Gets the text detection results of a Amazon Rekognition Video analysis started by <a>StartTextDetection</a>.
     * </p>
     * <p>
     * Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling
     * <a>StartTextDetection</a> which returns a job identifier (<code>JobId</code>) When the text detection operation
     * finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartTextDetection</code>. To get the results of the text detection
     * operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. if so,
     * call <code>GetTextDetection</code> and pass the job identifier (<code>JobId</code>) from the initial call of
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetTextDetection</code> returns an array of detected text (<code>TextDetections</code>) sorted by the time
     * the text was detected, up to 50 words per frame of video.
     * </p>
     * <p>
     * Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected
     * text, the time the text was detected, bounding box information for where the text was located, and unique
     * identifiers for words and their lines.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of text detections returned. If there are more results than
     * specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a
     * pagination token for getting the next set of results. To get the next page of results, call
     * <code>GetTextDetection</code> and populate the <code>NextToken</code> request parameter with the token value
     * returned from the previous call to <code>GetTextDetection</code>.
     * </p>
     * 
     * @param getTextDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTextDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.GetTextDetection
     */
    java.util.concurrent.Future<GetTextDetectionResult> getTextDetectionAsync(GetTextDetectionRequest getTextDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetTextDetectionRequest, GetTextDetectionResult> asyncHandler);

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm
     * first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature
     * vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face
     * match and search operations using the <a>SearchFaces</a> and <a>SearchFacesByImage</a> operations.
     * </p>
     * <p>
     * For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * To get the number of faces in a collection, call <a>DescribeCollection</a>.
     * </p>
     * <p>
     * If you're using version 1.0 of the face detection model, <code>IndexFaces</code> indexes the 15 largest faces in
     * the input image. Later versions of the face detection model index the 100 largest faces in the input image.
     * </p>
     * <p>
     * If you're using version 4 or later of the face model, image orientation information is not returned in the
     * <code>OrientationCorrection</code> field.
     * </p>
     * <p>
     * To determine which version of the model you're using, call <a>DescribeCollection</a> and supply the collection
     * ID. You can also get the model version from the value of <code>FaceModelVersion</code> in the response from
     * <code>IndexFaces</code>
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageId</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the <a>ListFaces</a> operation, the response
     * returns the external ID. You can use this external image ID to create a client-side index to associate the faces
     * with each image. You can then use the index to find all faces in an image.
     * </p>
     * <p>
     * You can specify the maximum number of faces to index with the <code>MaxFaces</code> input parameter. This is
     * useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those
     * belonging to people standing in the background.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. By default, <code>IndexFaces</code>
     * chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use
     * <code>QualityFilter</code>, to set the quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or
     * <code>HIGH</code>. If you do not want to filter detected faces, specify <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the
     * version of the face model associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * Information about faces detected in an image, but not indexed, is returned in an array of <a>UnindexedFace</a>
     * objects, <code>UnindexedFaces</code>. Faces aren't indexed for reasons such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The number of faces detected exceeds the value of the <code>MaxFaces</code> request parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too small compared to the image dimensions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face has an extreme pose.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face doesn’t have enough detail to be suitable for face search.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In response, the <code>IndexFaces</code> operation returns an array of metadata for all detected faces,
     * <code>FaceRecords</code>. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bounding box, <code>BoundingBox</code>, of the detected face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confidence value, <code>Confidence</code>, which indicates the confidence that the bounding box contains a
     * face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A face ID, <code>FaceId</code>, assigned by the service for each face that's detected and stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * An image ID, <code>ImageId</code>, assigned by the service for the input image.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you request all facial attributes (by using the <code>detectionAttributes</code> parameter), Amazon
     * Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth)
     * and other facial attributes. If you provide the same image, specify the same collection, and use the same
     * external ID in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p/>
     * <p>
     * The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @return A Java Future containing the result of the IndexFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.IndexFaces
     */
    java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest indexFacesRequest);

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified collection.
     * </p>
     * <p>
     * Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm
     * first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature
     * vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face
     * match and search operations using the <a>SearchFaces</a> and <a>SearchFacesByImage</a> operations.
     * </p>
     * <p>
     * For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * To get the number of faces in a collection, call <a>DescribeCollection</a>.
     * </p>
     * <p>
     * If you're using version 1.0 of the face detection model, <code>IndexFaces</code> indexes the 15 largest faces in
     * the input image. Later versions of the face detection model index the 100 largest faces in the input image.
     * </p>
     * <p>
     * If you're using version 4 or later of the face model, image orientation information is not returned in the
     * <code>OrientationCorrection</code> field.
     * </p>
     * <p>
     * To determine which version of the model you're using, call <a>DescribeCollection</a> and supply the collection
     * ID. You can also get the model version from the value of <code>FaceModelVersion</code> in the response from
     * <code>IndexFaces</code>
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageId</code> for the input image you provided, Amazon Rekognition
     * associates this ID with all faces that it detects. When you call the <a>ListFaces</a> operation, the response
     * returns the external ID. You can use this external image ID to create a client-side index to associate the faces
     * with each image. You can then use the index to find all faces in an image.
     * </p>
     * <p>
     * You can specify the maximum number of faces to index with the <code>MaxFaces</code> input parameter. This is
     * useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those
     * belonging to people standing in the background.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. By default, <code>IndexFaces</code>
     * chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use
     * <code>QualityFilter</code>, to set the quality bar by specifying <code>LOW</code>, <code>MEDIUM</code>, or
     * <code>HIGH</code>. If you do not want to filter detected faces, specify <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the
     * version of the face model associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * Information about faces detected in an image, but not indexed, is returned in an array of <a>UnindexedFace</a>
     * objects, <code>UnindexedFaces</code>. Faces aren't indexed for reasons such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The number of faces detected exceeds the value of the <code>MaxFaces</code> request parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too small compared to the image dimensions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face is too blurry.
     * </p>
     * </li>
     * <li>
     * <p>
     * The image is too dark.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face has an extreme pose.
     * </p>
     * </li>
     * <li>
     * <p>
     * The face doesn’t have enough detail to be suitable for face search.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In response, the <code>IndexFaces</code> operation returns an array of metadata for all detected faces,
     * <code>FaceRecords</code>. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bounding box, <code>BoundingBox</code>, of the detected face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confidence value, <code>Confidence</code>, which indicates the confidence that the bounding box contains a
     * face.
     * </p>
     * </li>
     * <li>
     * <p>
     * A face ID, <code>FaceId</code>, assigned by the service for each face that's detected and stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * An image ID, <code>ImageId</code>, assigned by the service for the input image.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you request all facial attributes (by using the <code>detectionAttributes</code> parameter), Amazon
     * Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth)
     * and other facial attributes. If you provide the same image, specify the same collection, and use the same
     * external ID in the <code>IndexFaces</code> operation, Amazon Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p/>
     * <p>
     * The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The
     * image must be formatted as a PNG or JPEG file.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IndexFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.IndexFaces
     */
    java.util.concurrent.Future<IndexFacesResult> indexFacesAsync(IndexFacesRequest indexFacesRequest,
            com.amazonaws.handlers.AsyncHandler<IndexFacesRequest, IndexFacesResult> asyncHandler);

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see Listing Collections in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AmazonRekognitionAsync.ListCollections
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest);

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is truncated, the response also provides a
     * <code>NextToken</code> that you can use in the subsequent request to fetch the next set of collection IDs.
     * </p>
     * <p>
     * For an example, see Listing Collections in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollections operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListCollections
     */
    java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest listCollectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler);

    /**
     * <p>
     * Lists the entries (images) within a dataset. An entry is a JSON Line that contains the information for a single
     * image, including the image location, assigned labels, and object location bounding boxes. For more information,
     * see <a href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-manifest-files.html">Creating a
     * manifest file</a>.
     * </p>
     * <p>
     * JSON Lines in the response include information about non-terminal errors found in the dataset. Non terminal
     * errors are reported in <code>errors</code> lists within each JSON Line. The same information is reported in the
     * training and testing validation result manifests that Amazon Rekognition Custom Labels creates during model
     * training.
     * </p>
     * <p>
     * You can filter the response in variety of ways, such as choosing which labels to return and returning JSON Lines
     * created after a specific date.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListDatasetEntries</code> action.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @return A Java Future containing the result of the ListDatasetEntries operation returned by the service.
     * @sample AmazonRekognitionAsync.ListDatasetEntries
     */
    java.util.concurrent.Future<ListDatasetEntriesResult> listDatasetEntriesAsync(ListDatasetEntriesRequest listDatasetEntriesRequest);

    /**
     * <p>
     * Lists the entries (images) within a dataset. An entry is a JSON Line that contains the information for a single
     * image, including the image location, assigned labels, and object location bounding boxes. For more information,
     * see <a href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-manifest-files.html">Creating a
     * manifest file</a>.
     * </p>
     * <p>
     * JSON Lines in the response include information about non-terminal errors found in the dataset. Non terminal
     * errors are reported in <code>errors</code> lists within each JSON Line. The same information is reported in the
     * training and testing validation result manifests that Amazon Rekognition Custom Labels creates during model
     * training.
     * </p>
     * <p>
     * You can filter the response in variety of ways, such as choosing which labels to return and returning JSON Lines
     * created after a specific date.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListDatasetEntries</code> action.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetEntries operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListDatasetEntries
     */
    java.util.concurrent.Future<ListDatasetEntriesResult> listDatasetEntriesAsync(ListDatasetEntriesRequest listDatasetEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetEntriesRequest, ListDatasetEntriesResult> asyncHandler);

    /**
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-labeling-images.html">Labeling
     * images</a>.
     * </p>
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more
     * information, see Labeling images in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * 
     * @param listDatasetLabelsRequest
     * @return A Java Future containing the result of the ListDatasetLabels operation returned by the service.
     * @sample AmazonRekognitionAsync.ListDatasetLabels
     */
    java.util.concurrent.Future<ListDatasetLabelsResult> listDatasetLabelsAsync(ListDatasetLabelsRequest listDatasetLabelsRequest);

    /**
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/customlabels-dg/md-labeling-images.html">Labeling
     * images</a>.
     * </p>
     * <p>
     * Lists the labels in a dataset. Amazon Rekognition Custom Labels uses labels to describe images. For more
     * information, see Labeling images in the <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * 
     * @param listDatasetLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetLabels operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListDatasetLabels
     */
    java.util.concurrent.Future<ListDatasetLabelsResult> listDatasetLabelsAsync(ListDatasetLabelsRequest listDatasetLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetLabelsRequest, ListDatasetLabelsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing
     * Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @return A Java Future containing the result of the ListFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.ListFaces
     */
    java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest listFacesRequest);

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding
     * box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing
     * Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListFaces
     */
    java.util.concurrent.Future<ListFacesResult> listFacesAsync(ListFacesRequest listFacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFacesRequest, ListFacesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of stream processors that you have created with <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param listStreamProcessorsRequest
     * @return A Java Future containing the result of the ListStreamProcessors operation returned by the service.
     * @sample AmazonRekognitionAsync.ListStreamProcessors
     */
    java.util.concurrent.Future<ListStreamProcessorsResult> listStreamProcessorsAsync(ListStreamProcessorsRequest listStreamProcessorsRequest);

    /**
     * <p>
     * Gets a list of stream processors that you have created with <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param listStreamProcessorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreamProcessors operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListStreamProcessors
     */
    java.util.concurrent.Future<ListStreamProcessorsResult> listStreamProcessorsAsync(ListStreamProcessorsRequest listStreamProcessorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamProcessorsRequest, ListStreamProcessorsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags in an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListTagsForResource</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRekognitionAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags in an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:ListTagsForResource</code> action.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities
     * in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 64 largest faces in the image. It lists the recognized celebrities
     * in the <code>CelebrityFaces</code> array and any unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces aren't among the largest 64 faces in the
     * image.
     * </p>
     * <p>
     * For each celebrity recognized, <code>RecognizeCelebrities</code> returns a <code>Celebrity</code> object. The
     * <code>Celebrity</code> object contains the celebrity name, ID, URL links to additional information, match
     * confidence, and a <code>ComparedFace</code> object that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your
     * application must store this information and use the <code>Celebrity</code> ID property as a unique identifier for
     * the celebrity. If you don't store the celebrity name or additional information URLs returned by
     * <code>RecognizeCelebrities</code>, you will need the ID to identify the celebrity in a call to the
     * <a>GetCelebrityInfo</a> operation.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @return A Java Future containing the result of the RecognizeCelebrities operation returned by the service.
     * @sample AmazonRekognitionAsync.RecognizeCelebrities
     */
    java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest recognizeCelebritiesRequest);

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities
     * in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 64 largest faces in the image. It lists the recognized celebrities
     * in the <code>CelebrityFaces</code> array and any unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces aren't among the largest 64 faces in the
     * image.
     * </p>
     * <p>
     * For each celebrity recognized, <code>RecognizeCelebrities</code> returns a <code>Celebrity</code> object. The
     * <code>Celebrity</code> object contains the celebrity name, ID, URL links to additional information, match
     * confidence, and a <code>ComparedFace</code> object that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your
     * application must store this information and use the <code>Celebrity</code> ID property as a unique identifier for
     * the celebrity. If you don't store the celebrity name or additional information URLs returned by
     * <code>RecognizeCelebrities</code>, you will need the ID to identify the celebrity in a call to the
     * <a>GetCelebrityInfo</a> operation.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecognizeCelebrities operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.RecognizeCelebrities
     */
    java.util.concurrent.Future<RecognizeCelebritiesResult> recognizeCelebritiesAsync(RecognizeCelebritiesRequest recognizeCelebritiesRequest,
            com.amazonaws.handlers.AsyncHandler<RecognizeCelebritiesRequest, RecognizeCelebritiesResult> asyncHandler);

    /**
     * <p>
     * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID
     * when you add a face to the collection using the <a>IndexFaces</a> operation. The operation compares the features
     * of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @return A Java Future containing the result of the SearchFaces operation returned by the service.
     * @sample AmazonRekognitionAsync.SearchFaces
     */
    java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest searchFacesRequest);

    /**
     * <p>
     * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID
     * when you add a face to the collection using the <a>IndexFaces</a> operation. The operation compares the features
     * of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by similarity score with the highest
     * similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for each face match, indicating the
     * confidence that the specific face matches the input face.
     * </p>
     * <p>
     * For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFaces operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.SearchFaces
     */
    java.util.concurrent.Future<SearchFacesResult> searchFacesAsync(SearchFacesRequest searchFacesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFacesRequest, SearchFacesResult> asyncHandler);

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the <a>IndexFaces</a> operation, and then use the
     * face IDs returned in subsequent calls to the <a>SearchFaces</a> operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the bounding boxes in the response to make face
     * crops, which then you can pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the
     * face that Amazon Rekognition used for the input image.
     * </p>
     * <p>
     * If no faces are detected in the input image, <code>SearchFacesByImage</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. Use <code>QualityFilter</code> to set the
     * quality bar for filtering by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do
     * not want to filter detected faces, specify <code>NONE</code>. The default value is <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the
     * version of the face model associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @return A Java Future containing the result of the SearchFacesByImage operation returned by the service.
     * @sample AmazonRekognitionAsync.SearchFacesByImage
     */
    java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest searchFacesByImageRequest);

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and then searches the specified collection
     * for matching faces. The operation compares the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the <a>IndexFaces</a> operation, and then use the
     * face IDs returned in subsequent calls to the <a>SearchFaces</a> operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the bounding boxes in the response to make face
     * crops, which then you can pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3
     * bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity score with the highest similarity first.
     * More specifically, it is an array of metadata for each face match found. Along with the metadata, the response
     * also includes a <code>similarity</code> indicating how similar the face is to the input face. In the response,
     * the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the
     * face that Amazon Rekognition used for the input image.
     * </p>
     * <p>
     * If no faces are detected in the input image, <code>SearchFacesByImage</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * The <code>QualityFilter</code> input parameter allows you to filter out detected faces that don’t meet a required
     * quality bar. The quality bar is based on a variety of common use cases. Use <code>QualityFilter</code> to set the
     * quality bar for filtering by specifying <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>. If you do
     * not want to filter detected faces, specify <code>NONE</code>. The default value is <code>NONE</code>.
     * </p>
     * <note>
     * <p>
     * To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the
     * version of the face model associated with a collection, call <a>DescribeCollection</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFacesByImage operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.SearchFacesByImage
     */
    java.util.concurrent.Future<SearchFacesByImageResult> searchFacesByImageAsync(SearchFacesByImageRequest searchFacesByImageRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFacesByImageRequest, SearchFacesByImageResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous recognition of celebrities in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use
     * <a>Video</a> to specify the bucket name and the filename of the video. <code>StartCelebrityRecognition</code>
     * returns a job identifier (<code>JobId</code>) which you use to get the results of the analysis. When celebrity
     * recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in <code>NotificationChannel</code>. To get the results of the
     * celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetCelebrityRecognition</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startCelebrityRecognitionRequest
     * @return A Java Future containing the result of the StartCelebrityRecognition operation returned by the service.
     * @sample AmazonRekognitionAsync.StartCelebrityRecognition
     */
    java.util.concurrent.Future<StartCelebrityRecognitionResult> startCelebrityRecognitionAsync(
            StartCelebrityRecognitionRequest startCelebrityRecognitionRequest);

    /**
     * <p>
     * Starts asynchronous recognition of celebrities in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use
     * <a>Video</a> to specify the bucket name and the filename of the video. <code>StartCelebrityRecognition</code>
     * returns a job identifier (<code>JobId</code>) which you use to get the results of the analysis. When celebrity
     * recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in <code>NotificationChannel</code>. To get the results of the
     * celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call <a>GetCelebrityRecognition</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startCelebrityRecognitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCelebrityRecognition operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartCelebrityRecognition
     */
    java.util.concurrent.Future<StartCelebrityRecognitionResult> startCelebrityRecognitionAsync(
            StartCelebrityRecognitionRequest startCelebrityRecognitionRequest,
            com.amazonaws.handlers.AsyncHandler<StartCelebrityRecognitionRequest, StartCelebrityRecognitionResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous detection of inappropriate, unwanted, or offensive content in a stored video. For a list of
     * moderation labels in Amazon Rekognition, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api">Using the image and video
     * moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartContentModeration</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the analysis. When content analysis is
     * finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content analysis, first check that the status value published to the Amazon SNS topic
     * is <code>SUCCEEDED</code>. If so, call <a>GetContentModeration</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Content moderation in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startContentModerationRequest
     * @return A Java Future containing the result of the StartContentModeration operation returned by the service.
     * @sample AmazonRekognitionAsync.StartContentModeration
     */
    java.util.concurrent.Future<StartContentModerationResult> startContentModerationAsync(StartContentModerationRequest startContentModerationRequest);

    /**
     * <p>
     * Starts asynchronous detection of inappropriate, unwanted, or offensive content in a stored video. For a list of
     * moderation labels in Amazon Rekognition, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/moderation.html#moderation-api">Using the image and video
     * moderation APIs</a>.
     * </p>
     * <p>
     * Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartContentModeration</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the analysis. When content analysis is
     * finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content analysis, first check that the status value published to the Amazon SNS topic
     * is <code>SUCCEEDED</code>. If so, call <a>GetContentModeration</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Content moderation in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startContentModerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartContentModeration operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartContentModeration
     */
    java.util.concurrent.Future<StartContentModerationResult> startContentModerationAsync(StartContentModerationRequest startContentModerationRequest,
            com.amazonaws.handlers.AsyncHandler<StartContentModerationRequest, StartContentModerationResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous detection of faces in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use <a>Video</a> to specify
     * the bucket name and the filename of the video. <code>StartFaceDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation. When face detection is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>. To get the results of the face detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceDetection</a> and
     * pass the job identifier (<code>JobId</code>) from the initial call to <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startFaceDetectionRequest
     * @return A Java Future containing the result of the StartFaceDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.StartFaceDetection
     */
    java.util.concurrent.Future<StartFaceDetectionResult> startFaceDetectionAsync(StartFaceDetectionRequest startFaceDetectionRequest);

    /**
     * <p>
     * Starts asynchronous detection of faces in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use <a>Video</a> to specify
     * the bucket name and the filename of the video. <code>StartFaceDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation. When face detection is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>. To get the results of the face detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceDetection</a> and
     * pass the job identifier (<code>JobId</code>) from the initial call to <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startFaceDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFaceDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartFaceDetection
     */
    java.util.concurrent.Future<StartFaceDetectionResult> startFaceDetectionAsync(StartFaceDetectionRequest startFaceDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartFaceDetectionRequest, StartFaceDetectionResult> asyncHandler);

    /**
     * <p>
     * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored
     * video.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartFaceSearch</code> returns a job identifier (<code>JobId</code>) which you use to get the
     * search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that you specify in
     * <code>NotificationChannel</code>. To get the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceSearch</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>. For more information, see
     * <a>procedure-person-search-videos</a>.
     * </p>
     * 
     * @param startFaceSearchRequest
     * @return A Java Future containing the result of the StartFaceSearch operation returned by the service.
     * @sample AmazonRekognitionAsync.StartFaceSearch
     */
    java.util.concurrent.Future<StartFaceSearchResult> startFaceSearchAsync(StartFaceSearchRequest startFaceSearchRequest);

    /**
     * <p>
     * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored
     * video.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartFaceSearch</code> returns a job identifier (<code>JobId</code>) which you use to get the
     * search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that you specify in
     * <code>NotificationChannel</code>. To get the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetFaceSearch</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>. For more information, see
     * <a>procedure-person-search-videos</a>.
     * </p>
     * 
     * @param startFaceSearchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFaceSearch operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartFaceSearch
     */
    java.util.concurrent.Future<StartFaceSearchResult> startFaceSearchAsync(StartFaceSearchRequest startFaceSearchRequest,
            com.amazonaws.handlers.AsyncHandler<StartFaceSearchRequest, StartFaceSearchResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous detection of labels in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes
     * objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like
     * landscape, evening, and nature; and activities like a person getting out of a car or a person skiing.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartLabelDetection</code> returns a job identifier (<code>JobId</code>) which you use to get
     * the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p/>
     * 
     * @param startLabelDetectionRequest
     * @return A Java Future containing the result of the StartLabelDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.StartLabelDetection
     */
    java.util.concurrent.Future<StartLabelDetectionResult> startLabelDetectionAsync(StartLabelDetectionRequest startLabelDetectionRequest);

    /**
     * <p>
     * Starts asynchronous detection of labels in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes
     * objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like
     * landscape, evening, and nature; and activities like a person getting out of a car or a person skiing.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the filename of
     * the video. <code>StartLabelDetection</code> returns a job identifier (<code>JobId</code>) which you use to get
     * the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion
     * status to the Amazon Simple Notification Service topic that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetLabelDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p/>
     * 
     * @param startLabelDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLabelDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartLabelDetection
     */
    java.util.concurrent.Future<StartLabelDetectionResult> startLabelDetectionAsync(StartLabelDetectionRequest startLabelDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartLabelDetectionRequest, StartLabelDetectionResult> asyncHandler);

    /**
     * <p>
     * Starts the asynchronous tracking of a person's path in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use <a>Video</a>
     * to specify the bucket name and the filename of the video. <code>StartPersonTracking</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the operation. When label detection is
     * finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the person detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param startPersonTrackingRequest
     * @return A Java Future containing the result of the StartPersonTracking operation returned by the service.
     * @sample AmazonRekognitionAsync.StartPersonTracking
     */
    java.util.concurrent.Future<StartPersonTrackingResult> startPersonTrackingAsync(StartPersonTrackingRequest startPersonTrackingRequest);

    /**
     * <p>
     * Starts the asynchronous tracking of a person's path in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use <a>Video</a>
     * to specify the bucket name and the filename of the video. <code>StartPersonTracking</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the operation. When label detection is
     * finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the person detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetPersonTracking</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param startPersonTrackingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartPersonTracking operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartPersonTracking
     */
    java.util.concurrent.Future<StartPersonTrackingResult> startPersonTrackingAsync(StartPersonTrackingRequest startPersonTrackingRequest,
            com.amazonaws.handlers.AsyncHandler<StartPersonTrackingRequest, StartPersonTrackingResult> asyncHandler);

    /**
     * <p>
     * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current
     * state of the model, use <a>DescribeProjectVersions</a>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by calling <a>DetectCustomLabels</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop a running model, call
     * <a>StopProjectVersion</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StartProjectVersion</code> action.
     * </p>
     * 
     * @param startProjectVersionRequest
     * @return A Java Future containing the result of the StartProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsync.StartProjectVersion
     */
    java.util.concurrent.Future<StartProjectVersionResult> startProjectVersionAsync(StartProjectVersionRequest startProjectVersionRequest);

    /**
     * <p>
     * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current
     * state of the model, use <a>DescribeProjectVersions</a>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by calling <a>DetectCustomLabels</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop a running model, call
     * <a>StopProjectVersion</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:StartProjectVersion</code> action.
     * </p>
     * 
     * @param startProjectVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartProjectVersion
     */
    java.util.concurrent.Future<StartProjectVersionResult> startProjectVersionAsync(StartProjectVersionRequest startProjectVersionRequest,
            com.amazonaws.handlers.AsyncHandler<StartProjectVersionRequest, StartProjectVersionResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous detection of segment detection in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartSegmentDetection</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the operation. When segment detection is
     * finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * You can use the <code>Filters</code> (<a>StartSegmentDetectionFilters</a>) input parameter to specify the minimum
     * detection confidence returned in the response. Within <code>Filters</code>, use <code>ShotFilter</code>
     * (<a>StartShotDetectionFilter</a>) to filter detected shots. Use <code>TechnicalCueFilter</code>
     * (<a>StartTechnicalCueDetectionFilter</a>) to filter technical cues.
     * </p>
     * <p>
     * To get the results of the segment detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. if so, call <a>GetSegmentDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startSegmentDetectionRequest
     * @return A Java Future containing the result of the StartSegmentDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.StartSegmentDetection
     */
    java.util.concurrent.Future<StartSegmentDetectionResult> startSegmentDetectionAsync(StartSegmentDetectionRequest startSegmentDetectionRequest);

    /**
     * <p>
     * Starts asynchronous detection of segment detection in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video. <code>StartSegmentDetection</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the operation. When segment detection is
     * finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic
     * that you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * You can use the <code>Filters</code> (<a>StartSegmentDetectionFilters</a>) input parameter to specify the minimum
     * detection confidence returned in the response. Within <code>Filters</code>, use <code>ShotFilter</code>
     * (<a>StartShotDetectionFilter</a>) to filter detected shots. Use <code>TechnicalCueFilter</code>
     * (<a>StartTechnicalCueDetectionFilter</a>) to filter technical cues.
     * </p>
     * <p>
     * To get the results of the segment detection operation, first check that the status value published to the Amazon
     * SNS topic is <code>SUCCEEDED</code>. if so, call <a>GetSegmentDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
     * </p>
     * 
     * @param startSegmentDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSegmentDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartSegmentDetection
     */
    java.util.concurrent.Future<StartSegmentDetectionResult> startSegmentDetectionAsync(StartSegmentDetectionRequest startSegmentDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartSegmentDetectionRequest, StartSegmentDetectionResult> asyncHandler);

    /**
     * <p>
     * Starts processing a stream processor. You create a stream processor by calling <a>CreateStreamProcessor</a>. To
     * tell <code>StartStreamProcessor</code> which stream processor to start, use the value of the <code>Name</code>
     * field specified in the call to <code>CreateStreamProcessor</code>.
     * </p>
     * 
     * @param startStreamProcessorRequest
     * @return A Java Future containing the result of the StartStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsync.StartStreamProcessor
     */
    java.util.concurrent.Future<StartStreamProcessorResult> startStreamProcessorAsync(StartStreamProcessorRequest startStreamProcessorRequest);

    /**
     * <p>
     * Starts processing a stream processor. You create a stream processor by calling <a>CreateStreamProcessor</a>. To
     * tell <code>StartStreamProcessor</code> which stream processor to start, use the value of the <code>Name</code>
     * field specified in the call to <code>CreateStreamProcessor</code>.
     * </p>
     * 
     * @param startStreamProcessorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartStreamProcessor
     */
    java.util.concurrent.Future<StartStreamProcessorResult> startStreamProcessorAsync(StartStreamProcessorRequest startStreamProcessorRequest,
            com.amazonaws.handlers.AsyncHandler<StartStreamProcessorRequest, StartStreamProcessorResult> asyncHandler);

    /**
     * <p>
     * Starts asynchronous detection of text in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use <a>Video</a> to specify
     * the bucket name and the filename of the video. <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation. When text detection is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the text detection operation, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. if so, call <a>GetTextDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartTextDetection</code>.
     * </p>
     * 
     * @param startTextDetectionRequest
     * @return A Java Future containing the result of the StartTextDetection operation returned by the service.
     * @sample AmazonRekognitionAsync.StartTextDetection
     */
    java.util.concurrent.Future<StartTextDetectionResult> startTextDetectionAsync(StartTextDetectionRequest startTextDetectionRequest);

    /**
     * <p>
     * Starts asynchronous detection of text in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use <a>Video</a> to specify
     * the bucket name and the filename of the video. <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation. When text detection is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify
     * in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the text detection operation, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. if so, call <a>GetTextDetection</a> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartTextDetection</code>.
     * </p>
     * 
     * @param startTextDetectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTextDetection operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StartTextDetection
     */
    java.util.concurrent.Future<StartTextDetectionResult> startTextDetectionAsync(StartTextDetectionRequest startTextDetectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartTextDetectionRequest, StartTextDetectionResult> asyncHandler);

    /**
     * <p>
     * Stops a running model. The operation might take a while to complete. To check the current status, call
     * <a>DescribeProjectVersions</a>.
     * </p>
     * 
     * @param stopProjectVersionRequest
     * @return A Java Future containing the result of the StopProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsync.StopProjectVersion
     */
    java.util.concurrent.Future<StopProjectVersionResult> stopProjectVersionAsync(StopProjectVersionRequest stopProjectVersionRequest);

    /**
     * <p>
     * Stops a running model. The operation might take a while to complete. To check the current status, call
     * <a>DescribeProjectVersions</a>.
     * </p>
     * 
     * @param stopProjectVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopProjectVersion operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StopProjectVersion
     */
    java.util.concurrent.Future<StopProjectVersionResult> stopProjectVersionAsync(StopProjectVersionRequest stopProjectVersionRequest,
            com.amazonaws.handlers.AsyncHandler<StopProjectVersionRequest, StopProjectVersionResult> asyncHandler);

    /**
     * <p>
     * Stops a running stream processor that was created by <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param stopStreamProcessorRequest
     * @return A Java Future containing the result of the StopStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsync.StopStreamProcessor
     */
    java.util.concurrent.Future<StopStreamProcessorResult> stopStreamProcessorAsync(StopStreamProcessorRequest stopStreamProcessorRequest);

    /**
     * <p>
     * Stops a running stream processor that was created by <a>CreateStreamProcessor</a>.
     * </p>
     * 
     * @param stopStreamProcessorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopStreamProcessor operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.StopStreamProcessor
     */
    java.util.concurrent.Future<StopStreamProcessorResult> stopStreamProcessorAsync(StopStreamProcessorRequest stopStreamProcessorRequest,
            com.amazonaws.handlers.AsyncHandler<StopStreamProcessorRequest, StopStreamProcessorResult> asyncHandler);

    /**
     * <p>
     * Adds one or more key-value tags to an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * Resources</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonRekognitionAsync.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more key-value tags to an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * Resources</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:TagResource</code> action.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonRekognitionAsync.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from an Amazon Rekognition collection, stream processor, or Custom Labels model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:UntagResource</code> action.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Adds or updates one or more entries (images) in a dataset. An entry is a JSON Line which contains the information
     * for a single image, including the image location, assigned labels, and object location bounding boxes. For more
     * information, see Image-Level labels in manifest files and Object localization in manifest files in the <i>Amazon
     * Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * If the <code>source-ref</code> field in the JSON line references an existing image, the existing image in the
     * dataset is updated. If <code>source-ref</code> field doesn't reference an existing image, the image is added as a
     * new image to the dataset.
     * </p>
     * <p>
     * You specify the changes that you want to make in the <code>Changes</code> input parameter. There isn't a limit to
     * the number JSON Lines that you can change, but the size of <code>Changes</code> must be less than 5MB.
     * </p>
     * <p>
     * <code>UpdateDatasetEntries</code> returns immediatly, but the dataset update might take a while to complete. Use
     * <a>DescribeDataset</a> to check the current status. The dataset updated successfully if the value of
     * <code>Status</code> is <code>UPDATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occured, call <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset update fails if a terminal error occurs (<code>Status</code> = <code>UPDATE_FAILED</code>). Currently,
     * you can't access the terminal error information from the Amazon Rekognition Custom Labels SDK.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:UpdateDatasetEntries</code> action.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @return A Java Future containing the result of the UpdateDatasetEntries operation returned by the service.
     * @sample AmazonRekognitionAsync.UpdateDatasetEntries
     */
    java.util.concurrent.Future<UpdateDatasetEntriesResult> updateDatasetEntriesAsync(UpdateDatasetEntriesRequest updateDatasetEntriesRequest);

    /**
     * <p>
     * Adds or updates one or more entries (images) in a dataset. An entry is a JSON Line which contains the information
     * for a single image, including the image location, assigned labels, and object location bounding boxes. For more
     * information, see Image-Level labels in manifest files and Object localization in manifest files in the <i>Amazon
     * Rekognition Custom Labels Developer Guide</i>.
     * </p>
     * <p>
     * If the <code>source-ref</code> field in the JSON line references an existing image, the existing image in the
     * dataset is updated. If <code>source-ref</code> field doesn't reference an existing image, the image is added as a
     * new image to the dataset.
     * </p>
     * <p>
     * You specify the changes that you want to make in the <code>Changes</code> input parameter. There isn't a limit to
     * the number JSON Lines that you can change, but the size of <code>Changes</code> must be less than 5MB.
     * </p>
     * <p>
     * <code>UpdateDatasetEntries</code> returns immediatly, but the dataset update might take a while to complete. Use
     * <a>DescribeDataset</a> to check the current status. The dataset updated successfully if the value of
     * <code>Status</code> is <code>UPDATE_COMPLETE</code>.
     * </p>
     * <p>
     * To check if any non-terminal errors occured, call <a>ListDatasetEntries</a> and check for the presence of
     * <code>errors</code> lists in the JSON Lines.
     * </p>
     * <p>
     * Dataset update fails if a terminal error occurs (<code>Status</code> = <code>UPDATE_FAILED</code>). Currently,
     * you can't access the terminal error information from the Amazon Rekognition Custom Labels SDK.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>rekognition:UpdateDatasetEntries</code> action.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatasetEntries operation returned by the service.
     * @sample AmazonRekognitionAsyncHandler.UpdateDatasetEntries
     */
    java.util.concurrent.Future<UpdateDatasetEntriesResult> updateDatasetEntriesAsync(UpdateDatasetEntriesRequest updateDatasetEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetEntriesRequest, UpdateDatasetEntriesResult> asyncHandler);

}